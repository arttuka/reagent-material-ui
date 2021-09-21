(ns reagent-mui.icons.looks-two-tone
  "Imports @mui/icons-material/LooksTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def looks-two-tone (create-svg-icon (e "path" #js {"d" "M12 6C5.93 6 1 10.93 1 17h2c0-4.96 4.04-9 9-9s9 4.04 9 9h2c0-6.07-4.93-11-11-11zm0 6c2.76 0 5 2.24 5 5h2c0-3.86-3.14-7-7-7s-7 3.14-7 7h2c0-2.76 2.24-5 5-5z"})
                                     "LooksTwoTone"))
