(ns reagent-mui.icons.chrome-reader-mode-two-tone
  "Imports @mui/icons-material/ChromeReaderModeTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def chrome-reader-mode-two-tone (create-svg-icon [(e "path" #js {"d" "M3 6h8v13H3z", "opacity" ".3"}) (e "path" #js {"d" "M21 4H3c-1.1 0-2 .9-2 2v13c0 1.1.9 2 2 2h18c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zM11 19H3V6h8v13zm10 0h-8V6h8v13zm-7-9.5h6V11h-6zm0 2.5h6v1.5h-6zm0 2.5h6V16h-6z"})]
                                                  "ChromeReaderModeTwoTone"))
