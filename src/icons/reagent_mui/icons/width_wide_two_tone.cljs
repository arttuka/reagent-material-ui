(ns reagent-mui.icons.width-wide-two-tone
  "Imports @mui/icons-material/WidthWideTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def width-wide-two-tone (create-svg-icon [(e "path" #js {"d" "M8 6h8v12H8z", "opacity" ".3"}) (e "path" #js {"d" "M20 4H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zM6 18H4V6h2v12zm10 0H8V6h8v12zm4 0h-2V6h2v12z"})]
                                          "WidthWideTwoTone"))
