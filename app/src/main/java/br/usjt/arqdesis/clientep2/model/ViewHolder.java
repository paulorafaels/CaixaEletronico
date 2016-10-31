package br.usjt.arqdesis.clientep2.model;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Anderson on 07/10/2016.
 */
public class ViewHolder {
    private ImageView fotoCliente;
    private TextView nomeCliente, detalheCliente;

    public ViewHolder(TextView detalheCliente, ImageView fotoCliente, TextView nomeCliente) {
        this.detalheCliente = detalheCliente;
        this.fotoCliente = fotoCliente;
        this.nomeCliente = nomeCliente;
    }

    public ImageView getFotoCliente() {
        return fotoCliente;
    }

    public void setFotoCliente(ImageView fotoCliente) {
        this.fotoCliente = fotoCliente;
    }

    public TextView getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(TextView nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public TextView getDetalheCliente() {
        return detalheCliente;
    }

    public void setDetalheCliente(TextView detalheCliente) {
        this.detalheCliente = detalheCliente;
    }
}
