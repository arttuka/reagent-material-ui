(ns reagent-mui.icons.layers-two-tone
  "Imports @mui/icons-material/LayersTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def layers-two-tone (create-svg-icon [(e "path" #js {"d" "M6.26 9 12 13.47 17.74 9 12 4.53z", "opacity" ".3"}) (e "path" #js {"d" "m19.37 12.8-7.38 5.74-7.37-5.73L3 14.07l9 7 9-7zM12 2 3 9l1.63 1.27L12 16l7.36-5.73L21 9l-9-7zm0 11.47L6.26 9 12 4.53 17.74 9 12 13.47z"})]
                                      "LayersTwoTone"))
