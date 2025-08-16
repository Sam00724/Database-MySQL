db.products.find({ product_price: { $gt: 500 } }).limit(4)
