(ns reagent-mui.icons.chair-alt-two-tone
  "Imports @mui/icons-material/ChairAltTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def chair-alt-two-tone (create-svg-icon [(e "path" #js {"d" "M7 14h10v2H7zm0-9h10v3H7z", "opacity" ".3"}) (e "path" #js {"d" "M17 10c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2H7c-1.1 0-2 .9-2 2v3c0 1.1.9 2 2 2h1v2H7c-1.1 0-2 .9-2 2v7h2v-3h10v3h2v-7c0-1.1-.9-2-2-2h-1v-2h1zm0 4v2H7v-2h10zm-7-2v-2h4v2h-4zM7 8V5h10v3H7z"})]
                                         "ChairAltTwoTone"))
