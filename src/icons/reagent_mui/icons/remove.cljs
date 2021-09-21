(ns reagent-mui.icons.remove
  "Imports @mui/icons-material/Remove as a Reagent component."
  (:refer-clojure :exclude [remove])
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def remove (create-svg-icon (e "path" #js {"d" "M19 13H5v-2h14v2z"})
                             "Remove"))
