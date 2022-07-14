import tornado.web
import tornado.ioloop
import tornado.httpserver

from pyecharts.charts import Line
from pyecharts import options as opts
from pyecharts.charts import Kline
from data import DataDao


def kline_base(func) -> str:
    data = DataDao()
    data.setfunc(func)
    c = (
        Kline()
        .add_xaxis(xaxis_data=data.getx())
        .add_yaxis(
            series_name="",
            itemstyle_opts=opts.ItemStyleOpts(color="#ec0000", color0="#00da3c"),
            y_axis=data.gety()
        )
        .set_global_opts(
            xaxis_opts=opts.AxisOpts(is_scale=True),
            yaxis_opts=opts.AxisOpts(
                is_scale=True,
                splitarea_opts=opts.SplitAreaOpts(
                    is_show=True, areastyle_opts=opts.AreaStyleOpts(opacity=1)
                ),
            ),
            datazoom_opts=[opts.DataZoomOpts(pos_bottom="-2%", range_start=20, range_end=100),
                           opts.DataZoomOpts(type_="inside", range_start=20, range_end=100)],
            title_opts=opts.TitleOpts(title="欧元人民币汇率k图", subtitle='不知道写点啥'),
        )
    )
    return c.dump_options()


def line_base(fuc) -> str:
    data = DataDao()
    data.setfunc(fuc)
    c = (
        Line()
        .add_xaxis(data.getx())
        .add_yaxis(y_axis=data.gety2(),
                   series_name="", )
        .set_global_opts(
            xaxis_opts=opts.AxisOpts(is_scale=True),
            yaxis_opts=opts.AxisOpts(
                is_scale=True,
                splitarea_opts=opts.SplitAreaOpts(
                    is_show=True, areastyle_opts=opts.AreaStyleOpts(opacity=1)
                ),
            ),
            datazoom_opts=[opts.DataZoomOpts(pos_bottom="-2%", range_start=70, range_end=100),
                           opts.DataZoomOpts(type_="inside", range_start=70, range_end=100)],
            title_opts=opts.TitleOpts(title="欧元人民币汇率k图", subtitle='不知道写点啥'),
        )
    )
    return c.dump_options()


def set_default_header(self):
    # 后面的*可以换成ip地址，意为允许访问的地址
    self.set_header("Access-Control-Allow-Origin", "*")
    self.set_header("Access-Control-Allow-Headers", "x-requested-with")
    self.set_header("Access-Control-Allow-Methods", "POST, GET, PUT, DELETE")
    self.set_header("Content-Type", "application/json; charset=UTF-8")


class LineChart(tornado.web.RequestHandler):
    def data_received(self, chunk):
        pass

    def get(self, fuc):
        set_default_header(self)
        chart_result = line_base(fuc)
        # 返回结果
        self.write(chart_result)
        self.finish()


class PageHandler(tornado.web.RequestHandler):
    def data_received(self, chunk):
        pass

    def get(self):
        self.render("index.html")


class KlineChart(tornado.web.RequestHandler):
    def data_received(self, chunk):
        pass

    def get(self, func):
        set_default_header(self)
        chart_result = kline_base(func)
        # 返回结果
        self.write(chart_result)
        self.finish()


def make_app():
    return tornado.web.Application([
        (r"/", PageHandler),
        (r"/getLineChart/(.*)", LineChart),
        (r"/getKlineChart/(.*)", KlineChart)
    ])


if __name__ == "__main__":
    port = 8889
    app = make_app()
    sockets = tornado.netutil.bind_sockets(port)
    http_server = tornado.httpserver.HTTPServer(app)
    http_server.add_sockets(sockets)
    print("Server Start Running!\nHost: {} Port: {}".format("127.0.0.1", port))
    tornado.ioloop.IOLoop.instance().start()
