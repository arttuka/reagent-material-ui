(ns reagent-mui.icons.add-home-rounded
  "Imports @mui/icons-material/AddHomeRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def add-home-rounded (create-svg-icon [(e "path" #js {"d" "M16.53 11.16c1.23-.26 2.4-.18 3.47.14V10c0-.63-.3-1.22-.8-1.6l-6-4.5c-.71-.53-1.69-.53-2.4 0l-6 4.5c-.5.38-.8.97-.8 1.6v9c0 1.1.9 2 2 2h5.68c-.61-1.28-.86-2.77-.55-4.35.52-2.72 2.69-4.91 5.4-5.49z"}) (e "path" #js {"d" "M18 13c-2.76 0-5 2.24-5 5s2.24 5 5 5 5-2.24 5-5-2.24-5-5-5zm3 5.5h-2.5V21h-1v-2.5H15v-1h2.5V15h1v2.5H21v1z"})]
                                       "AddHomeRounded"))
