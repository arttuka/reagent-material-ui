(ns reagent-mui.icons.logout-sharp
  "Imports @mui/icons-material/LogoutSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def logout-sharp (create-svg-icon [(e "path" #js {"d" "M5 5h7V3H3v18h9v-2H5z"}) (e "path" #js {"d" "m21 12-4-4v3H9v2h8v3z"})]
                                   "LogoutSharp"))
