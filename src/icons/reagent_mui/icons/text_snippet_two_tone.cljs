(ns reagent-mui.icons.text-snippet-two-tone
  "Imports @mui/icons-material/TextSnippetTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def text-snippet-two-tone (create-svg-icon [(e "path" #js {"d" "M14.17 5 19 9.83V19H5V5h9.17M7 15h10v2H7v-2zm0-4h10v2H7v-2zm0-4h7v2H7V7z", "opacity" ".3"}) (e "path" #js {"d" "M14.17 5 19 9.83V19H5V5h9.17m0-2H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V9.83c0-.53-.21-1.04-.59-1.41l-4.83-4.83c-.37-.38-.88-.59-1.41-.59zM7 15h10v2H7v-2zm0-4h10v2H7v-2zm0-4h7v2H7V7z"})]
                                            "TextSnippetTwoTone"))
