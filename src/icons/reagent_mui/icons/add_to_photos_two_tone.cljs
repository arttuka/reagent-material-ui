(ns reagent-mui.icons.add-to-photos-two-tone
  "Imports @mui/icons-material/AddToPhotosTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def add-to-photos-two-tone (create-svg-icon [(e "path" #js {"d" "M20 4H8v12h12V4zm-1 7h-4v4h-2v-4H9V9h4V5h2v4h4v2z", "opacity" ".3"}) (e "path" #js {"d" "M4 22h14v-2H4V6H2v14c0 1.1.9 2 2 2zm4-4h12c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2H8c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2zM8 4h12v12H8V4zm7 1h-2v4H9v2h4v4h2v-4h4V9h-4z"})]
                                             "AddToPhotosTwoTone"))
