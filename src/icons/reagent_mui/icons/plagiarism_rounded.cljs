(ns reagent-mui.icons.plagiarism-rounded
  "Imports @mui/icons-material/PlagiarismRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def plagiarism-rounded (create-svg-icon [(e "path" #js {"d" "m19.41 7.41-4.83-4.83c-.37-.37-.88-.58-1.41-.58H6c-1.1 0-2 .9-2 2v16c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V8.83c0-.53-.21-1.04-.59-1.42zm-3.67 11.33c-.39.39-1.02.39-1.41 0l-1.18-1.18c-1.33.71-3.01.53-4.13-.59-1.52-1.52-1.35-4.08.5-5.37 1.16-.81 2.78-.81 3.95 0 1.55 1.08 1.9 3.04 1.09 4.55l1.18 1.18c.39.39.39 1.02 0 1.41zM14 9c-.55 0-1-.45-1-1V3.5L18.5 9H14z"}) (e "circle" #js {"cx" "11.5", "cy" "14.5", "r" "1.5"})]
                                         "PlagiarismRounded"))
