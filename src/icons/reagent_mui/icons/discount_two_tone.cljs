(ns reagent-mui.icons.discount-two-tone
  "Imports @mui/icons-material/DiscountTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def discount-two-tone (create-svg-icon [(e "path" #js {"d" "M19 9.79 11.21 2H5v6.21L12.79 16 19 9.79zM7.25 5.5C6.56 5.5 6 4.94 6 4.25S6.56 3 7.25 3s1.25.56 1.25 1.25S7.94 5.5 7.25 5.5z", "opacity" ".3"}) (e "path" #js {"d" "M12.79 21 3 11.21v2c0 .53.21 1.04.59 1.41l7.79 7.79c.78.78 2.05.78 2.83 0l6.21-6.21c.78-.78.78-2.05 0-2.83L12.79 21z"}) (e "path" #js {"d" "M11.38 17.41c.39.39.9.59 1.41.59.51 0 1.02-.2 1.41-.59l6.21-6.21c.78-.78.78-2.05 0-2.83L12.62.58C12.25.21 11.74 0 11.21 0H5C3.9 0 3 .9 3 2v6.21c0 .53.21 1.04.59 1.41l7.79 7.79zM5 2h6.21L19 9.79 12.79 16 5 8.21V2z"}) (e "circle" #js {"cx" "7.25", "cy" "4.25", "r" "1.25"})]
                                        "DiscountTwoTone"))
