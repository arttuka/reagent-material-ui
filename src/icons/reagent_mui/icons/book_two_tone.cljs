(ns reagent-mui.icons.book-two-tone
  "Imports @mui/icons-material/BookTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def book-two-tone (create-svg-icon [(e "path" #js {"d" "m13 13-3-2.25L7 13V4H6v16h12V4h-5z", "opacity" ".3"}) (e "path" #js {"d" "M18 2H6c-1.1 0-2 .9-2 2v16c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zM9 4h2v5l-1-.75L9 9V4zm9 16H6V4h1v9l3-2.25L13 13V4h5v16z"})]
                                    "BookTwoTone"))
