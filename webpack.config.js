const webpack = require('webpack');
const path = require('path');

module.exports = {
    entry: [
        // Set up an ES6-ish environment
        'babel-polyfill',

        // Add your application's scripts below
        './src/main/js/app.jsx',
    ],
    output: {
        path: './src/main/webapp/js',
        filename: 'app.bundle.js'
    },
    resolve: {
        extensions: ['', '.js', '.jsx'],
        alias: {
            lib: path.join(process.cwd(), 'app', 'lib'),
            react: path.resolve('./node_modules/react'),
            'react-dom': path.resolve('./node_modules/react-dom'),
        },
    },
    module: {
        loaders: [
            {
                test: /\.jsx?$/,
                loader: 'babel-loader',
                exclude: /node_modules/,
            },
        ]
    }
};
