(ns reagent-mui.icons.gpp-bad
  "Imports @mui/icons-material/GppBad as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def gpp-bad (create-svg-icon (e "path" #js {"d" "M12 2 4 5v6.09c0 5.05 3.41 9.76 8 10.91 4.59-1.15 8-5.86 8-10.91V5l-8-3zm3.5 12.09-1.41 1.41L12 13.42 9.91 15.5 8.5 14.09 10.59 12 8.5 9.91 9.91 8.5 12 10.59l2.09-2.09 1.41 1.41L13.42 12l2.08 2.09z"})
                              "GppBad"))
