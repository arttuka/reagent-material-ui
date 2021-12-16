(ns reagent-mui.icons.content-paste-go-two-tone
  "Imports @mui/icons-material/ContentPasteGoTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def content-paste-go-two-tone (create-svg-icon [(e "path" #js {"d" "M10 17c0-3.31 2.69-6 6-6h3V5h-2v3H7V5H5v14h5v-2z", "opacity" ".3"}) (e "path" #js {"d" "M10 19H5V5h2v3h10V5h2v6h2V5c0-1.1-.9-2-2-2h-4.18C14.4 1.84 13.3 1 12 1s-2.4.84-2.82 2H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h5v-2zm2-16c.55 0 1 .45 1 1s-.45 1-1 1-1-.45-1-1 .45-1 1-1z"}) (e "path" #js {"d" "m18.01 13-1.42 1.41 1.58 1.58H12v2h6.17l-1.58 1.59 1.42 1.41 3.99-4z"})]
                                                "ContentPasteGoTwoTone"))
