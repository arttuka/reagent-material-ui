(ns reagent-mui.icons.collections-sharp
  "Imports @mui/icons-material/CollectionsSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def collections-sharp (create-svg-icon (e "path" #js {"d" "M22 18V2H6v16h16zm-11-6 2.03 2.71L16 11l4 5H8l3-4zM2 6v16h16v-2H4V6H2z"})
                                        "CollectionsSharp"))
