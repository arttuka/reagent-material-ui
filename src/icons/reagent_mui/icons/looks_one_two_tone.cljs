(ns reagent-mui.icons.looks-one-two-tone
  "Imports @mui/icons-material/LooksOneTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def looks-one-two-tone (create-svg-icon [(e "path" #js {"d" "M19 5H5v14h14V5zm-5 12h-2V9h-2V7h4v10z", "opacity" ".3"}) (e "path" #js {"d" "M5 21h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2zM5 5h14v14H5V5zm5 4h2v8h2V7h-4z"})]
                                         "LooksOneTwoTone"))
