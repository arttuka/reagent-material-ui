(ns reagent-mui.icons.looks-two-two-tone
  "Imports @mui/icons-material/LooksTwoTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def looks-two-two-tone (create-svg-icon [(e "path" #js {"d" "M19 5H5v14h14V5zm-4 6c0 1.11-.9 2-2 2h-2v2h4v2H9v-4c0-1.11.9-2 2-2h2V9H9V7h4c1.1 0 2 .89 2 2v2z", "opacity" ".3"}) (e "path" #js {"d" "M5 21h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2zM5 5h14v14H5V5zm8 2H9v2h4v2h-2c-1.1 0-2 .89-2 2v4h6v-2h-4v-2h2c1.1 0 2-.89 2-2V9c0-1.11-.9-2-2-2z"})]
                                         "LooksTwoTwoTone"))
