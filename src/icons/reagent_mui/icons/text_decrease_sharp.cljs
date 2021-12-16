(ns reagent-mui.icons.text-decrease-sharp
  "Imports @mui/icons-material/TextDecreaseSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def text-decrease-sharp (create-svg-icon (e "path" #js {"d" "M.99 19h2.42l1.27-3.58h5.65L11.59 19h2.42L8.75 5h-2.5L.99 19zm4.42-5.61L7.44 7.6h.12l2.03 5.79H5.41zM23 11v2h-8v-2h8z"})
                                          "TextDecreaseSharp"))
