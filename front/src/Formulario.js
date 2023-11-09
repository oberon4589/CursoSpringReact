import React from 'react';

const Formulario = ({ botao, eventoTeclado }) => {
    return (
        <div>
            <form>
                <input
                    type="text"
                    onChange={eventoTeclado}
                    name="Nome"
                    placeholder="Nome"
                    className="form-control"
                />
                <input
                    type="text"
                    onChange={eventoTeclado}
                    name="Marca"
                    placeholder="Marca"
                    className="form-control"
                />

                {botao ? (
                    <input
                        type="button"
                        value="Cadastrar"
                        className="btn btn-primary"
                    />
                ) : (
                    <div>
                        <input
                            type="button"
                            value="Alterar"
                            className="btn btn-warning"
                        />
                        <input
                            type="button"
                            value="Remover"
                            className="btn btn-danger"
                        />
                        <input
                            type="button"
                            value="Cancelar"
                            className="btn btn-secondary"
                        />
                    </div>
                )}
            </form>
        </div>
    );
};

export default Formulario;
