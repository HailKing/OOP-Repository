package br.edu.ifpb.livro;

public class Livro {
        private int id;
        private String titulo;

        public Livro(){
        }

        public Livro(int id, String titulo) {
            setId(id);
            setTitulo(titulo);
        }

        public void setId(int id) {
            if(id >= 0) this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setTitulo(String titulo) {
            if(!titulo.isEmpty())
                if(!titulo.isBlank())
                    this.titulo = titulo;
        }

        public String getTitulo() {
            return titulo;
        }

        @Override
        public String toString() {
            return "Livro {" +
                    "ID = " + id +
                    ", Título = '" + titulo + '\'' +
                    '}';
        }
}
