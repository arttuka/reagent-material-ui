(ns reagent-mui.icons.library-add-two-tone
  "Imports @mui/icons-material/LibraryAddTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def library-add-two-tone (create-svg-icon [(e "path" #js {"d" "M8 16h12V4H8v12zm2-7h3V6h2v3h3v2h-3v3h-2v-3h-3V9z", "opacity" ".3"}) (e "path" #js {"d" "M4 22h14v-2H4V6H2v14c0 1.1.9 2 2 2zM8 2c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2H8zm12 14H8V4h12v12zm-7-2h2v-3h3V9h-3V6h-2v3h-3v2h3z"})]
                                           "LibraryAddTwoTone"))
