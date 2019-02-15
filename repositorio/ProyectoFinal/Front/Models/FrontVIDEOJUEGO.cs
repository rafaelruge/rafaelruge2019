using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace Front.Models
{
    public class FrontVIDEOJUEGO
    {
        public int IdVideoJuego { get; set; }
        [Required(ErrorMessage = "Este campo es necesario")]
        public string NombreVideoJuego { get; set; }
        public string CategoriaVideoJuego { get; set; }
        public int PesoVideoJuego { get; set; }
        public string CategoriaEdad { get; set; }
    }
}