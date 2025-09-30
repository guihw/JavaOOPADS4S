package com.cesuoop.atividadecrud.service;

import com.cesuoop.atividadecrud.model.ProdutoModel;
import com.cesuoop.atividadecrud.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository productRepository;

    public List<ProdutoModel> findAll() {
        return productRepository.findAll();
    }

    public Optional<ProdutoModel> findById(Long id) {
        return productRepository.findById(id);
    }

    public ProdutoModel save(ProdutoModel product) {
        return productRepository.save(product);
    }

    public ProdutoModel update(Long id, ProdutoModel productDetails) {
        ProdutoModel product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        product.setName(productDetails.getName());
        product.setPrice(productDetails.getPrice());
        product.setDescription(productDetails.getDescription());

        return productRepository.save(product);
    }

    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}
