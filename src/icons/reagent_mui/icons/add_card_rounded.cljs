(ns reagent-mui.icons.add-card-rounded
  "Imports @mui/icons-material/AddCardRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def add-card-rounded (create-svg-icon (e "path" #js {"d" "M14 19c0-.55-.45-1-1-1H4v-6h18V6c0-1.1-.9-2-2-2H4c-1.11 0-1.99.89-1.99 2L2 18c0 1.11.89 2 2 2h9c.55 0 1-.45 1-1zm6-11H4V6h16v2zm0 14c-.55 0-1-.45-1-1v-2h-2c-.55 0-1-.45-1-1s.45-1 1-1h2v-2c0-.55.45-1 1-1s1 .45 1 1v2h2c.55 0 1 .45 1 1s-.45 1-1 1h-2v2c0 .55-.45 1-1 1z"})
                                       "AddCardRounded"))
