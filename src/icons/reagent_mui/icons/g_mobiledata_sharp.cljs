(ns reagent-mui.icons.g-mobiledata-sharp
  "Imports @mui/icons-material/GMobiledataSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def g-mobiledata-sharp (create-svg-icon (e "path" #js {"d" "M12 11v2h2v2H9V9h7V7H7v10h9v-6h-4z"})
                                         "GMobiledataSharp"))
