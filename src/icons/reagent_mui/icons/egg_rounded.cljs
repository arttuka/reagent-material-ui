(ns reagent-mui.icons.egg-rounded
  "Imports @mui/icons-material/EggRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def egg-rounded (create-svg-icon (e "path" #js {"d" "M12 3C8.5 3 5 9.33 5 14c0 3.87 3.13 7 7 7s7-3.13 7-7c0-4.67-3.5-11-7-11zm1 15c-3 0-5-1.99-5-5 0-.55.45-1 1-1s1 .45 1 1c0 2.92 2.42 3 3 3 .55 0 1 .45 1 1s-.45 1-1 1z"})
                                  "EggRounded"))