using MvcWebAPIvacio.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web.Http;


namespace MvcWebAPIvacio.Controllers
{
    public class EmpleadoController : ApiController
    {
        private static IList<Empleado> listaEmpleado = new List<Empleado> {
        new Empleado() { idEmpleado = 2, nombreEmpleado = "Carlos", apellidoEmpleado = "Perez", cargoEmpleado = "Gerente"},
        new Empleado() { idEmpleado = 3, nombreEmpleado = "Andres", apellidoEmpleado = "Rodriguez", cargoEmpleado = "Contador"},
        new Empleado() { idEmpleado = 4, nombreEmpleado = "Yurani", apellidoEmpleado = "Valencia", cargoEmpleado = "Vendedor"}
    };
        // Get api/empleado                Visualizar empleados   
        public IEnumerable<Empleado> Get()
        {
            return listaEmpleado;
        }

        // GET api/empleado/id            Visualizar empleados por Id
        public Empleado Get(int id)
        {
            return listaEmpleado.First(e => e.idEmpleado == id);
        }

        //POST api/empleado             Agregar empleados
        public void Post (Empleado empleacopost)
        {
            int maxid = listaEmpleado.Max(e => e.idEmpleado);
            empleacopost.idEmpleado = maxid + 1;
            listaEmpleado.Add(empleacopost);
        }

        //Put api/empleado/idempleado
        public void PUT(int id, Empleado empleadoPut)
        {
            int index = listaEmpleado.ToList().FindIndex(e => e.idEmpleado == id);
            listaEmpleado[index] = empleadoPut;
        }
        //DELETE api/empleado/idempleado
        public void Delete(int id)
        {
            Empleado empleado = Get(id);
            listaEmpleado.Remove(empleado);
        }
        [AcceptVerbs("GET")]
        public Empleado verEmpleadoxId(int id)
        {return listaEmpleado.First(e => e.idEmpleado == id);}
        [HttpGet]
        public IEnumerable<Empleado> VerEmpleado() { return listaEmpleado; }
        [HttpPut]
        public void actualizarEmpleado(int id, Empleado empleadoPut)
        {
            int index = listaEmpleado.ToList().FindIndex(e => e.idEmpleado == id);
            listaEmpleado[index] = empleadoPut;
        }
        [HttpPost]
        public void agregarEmpleado(Empleado empleado, int id)
        {
            int index = listaEmpleado.ToList().FindIndex(e => e.idEmpleado == id);
            listaEmpleado[index] = empleado;
        }
        [HttpDelete]
        public void eliminarEmpleado(int id)
        {
            Empleado empleado = Get(id);
            listaEmpleado.Remove(empleado);
        }
    }
}
