(ns reagent-mui.icons.hide-image-sharp
  "Imports @mui/icons-material/HideImageSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def hide-image-sharp (create-svg-icon (e "path" #js {"d" "M21 3H5.83L21 18.17zM2.81 2.81 1.39 4.22 3 5.83V21h15.17l1.61 1.61 1.41-1.41L2.81 2.81zM6 17l3-4 2.25 3 .82-1.1 2.1 2.1H6z"})
                                       "HideImageSharp"))
