(ns reagent-mui.icons.library-add-check-two-tone
  "Imports @mui/icons-material/LibraryAddCheckTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def library-add-check-two-tone (create-svg-icon [(e "path" #js {"d" "M8 16h12V4H8v12zm2.4-6.91 2.07 2.08L17.6 6 19 7.41 12.47 14 9 10.5l1.4-1.41z", "opacity" ".3"}) (e "path" #js {"d" "M20 2H8c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm0 14H8V4h12v12zm-7.53-2L9 10.5l1.4-1.41 2.07 2.08L17.6 6 19 7.41 12.47 14zM4 20h14v2H4c-1.1 0-2-.9-2-2V6h2v14z"})]
                                                 "LibraryAddCheckTwoTone"))
