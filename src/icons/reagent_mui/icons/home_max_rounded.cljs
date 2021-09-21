(ns reagent-mui.icons.home-max-rounded
  "Imports @mui/icons-material/HomeMaxRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def home-max-rounded (create-svg-icon (e "path" #js {"d" "M19 5H5C2.79 5 1 6.79 1 9v5c0 2.21 1.79 4 4 4h2c0 .55.45 1 1 1h8c.55 0 1-.45 1-1h2c2.21 0 4-1.79 4-4V9c0-2.21-1.79-4-4-4zm2 9c0 1.1-.9 2-2 2H5c-1.1 0-2-.9-2-2V9c0-1.1.9-2 2-2h14c1.1 0 2 .9 2 2v5z"})
                                       "HomeMaxRounded"))
