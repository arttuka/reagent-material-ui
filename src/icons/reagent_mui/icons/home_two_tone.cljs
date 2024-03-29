(ns reagent-mui.icons.home-two-tone
  "Imports @mui/icons-material/HomeTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def home-two-tone (create-svg-icon [(e "path" #js {"d" "M12 3 2 12h3v8h6v-6h2v6h6v-8h3L12 3zm5 15h-2v-6H9v6H7v-7.81l5-4.5 5 4.5V18z"}) (e "path" #js {"d" "M7 10.19V18h2v-6h6v6h2v-7.81l-5-4.5z", "opacity" ".3"})]
                                    "HomeTwoTone"))
