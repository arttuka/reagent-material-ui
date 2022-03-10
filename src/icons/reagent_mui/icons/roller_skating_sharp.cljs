(ns reagent-mui.icons.roller-skating-sharp
  "Imports @mui/icons-material/RollerSkatingSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def roller-skating-sharp (create-svg-icon (e "path" #js {"d" "m20 16-.01-6-5.71-1.43c-.88-.22-1.58-.81-1.96-1.57H9V6h3.02L12 5H9V4h3V1H4v15h16zM5 23c-1.66 0-3-1.34-3-3s1.34-3 3-3 3 1.34 3 3-1.34 3-3 3zm14 0c-1.66 0-3-1.34-3-3s1.34-3 3-3 3 1.34 3 3-1.34 3-3 3zm-7 0c-1.66 0-3-1.34-3-3s1.34-3 3-3 3 1.34 3 3-1.34 3-3 3z"})
                                           "RollerSkatingSharp"))
