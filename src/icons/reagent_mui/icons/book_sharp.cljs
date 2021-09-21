(ns reagent-mui.icons.book-sharp
  "Imports @mui/icons-material/BookSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def book-sharp (create-svg-icon (e "path" #js {"d" "M20 2H4v20h16V2zM6 4h5v8l-2.5-1.5L6 12V4z"})
                                 "BookSharp"))
