package web;

import dao.CarDao;
import dao.CarIn;
import entity.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet(value = "/q")
public class CarSearch extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        String condition = req.getParameter("condition");

        CarDao carDao = new CarIn();
        List<Car> cars =carDao.getCarById(condition);

        req.setAttribute("cars", cars);

        req.getSession().setAttribute("msg", "当前查询条件为:[" + condition + "]");

        req.getRequestDispatcher("/jsp/CarList.jsp").include(req, resp);
    }
}
