db.products.find({ product_price: { $not: { $gte: 400, $lte: 600 } } })
