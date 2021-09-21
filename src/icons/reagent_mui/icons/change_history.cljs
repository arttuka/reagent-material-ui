(ns reagent-mui.icons.change-history
  "Imports @mui/icons-material/ChangeHistory as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def change-history (create-svg-icon (e "path" #js {"d" "M12 7.77 18.39 18H5.61L12 7.77M12 4 2 20h20L12 4z"})
                                     "ChangeHistory"))
