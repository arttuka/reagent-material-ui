(ns reagent-mui.icons.plagiarism-two-tone
  "Imports @mui/icons-material/PlagiarismTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def plagiarism-two-tone (create-svg-icon [(e "path" #js {"d" "M13 4H6v16h12V9h-5V4zm.97 7.03c1.12 1.12 1.31 2.8.59 4.13l1.88 1.88-1.41 1.41-1.88-1.88c-1.33.71-3.01.53-4.13-.59-1.37-1.37-1.37-3.58 0-4.95s3.59-1.37 4.95 0z", "opacity" ".3"}) (e "circle" #js {"cx" "11.5", "cy" "13.5", "r" "1.5", "opacity" ".3"}) (e "path" #js {"d" "M14 2H6c-1.1 0-2 .9-2 2v16c0 1.1.89 2 1.99 2H18c1.1 0 2-.9 2-2V8l-6-6zm4 18H6V4h7v5h5v11z"}) (e "path" #js {"d" "M9.03 11.03c-1.37 1.37-1.37 3.58 0 4.95 1.12 1.12 2.8 1.31 4.13.59l1.88 1.88 1.41-1.41-1.88-1.88c.71-1.33.53-3.01-.59-4.13-1.37-1.37-3.59-1.37-4.95 0zm3.53 3.53c-.59.59-1.54.59-2.12 0-.59-.59-.59-1.54 0-2.12.59-.59 1.54-.59 2.12 0 .59.59.59 1.53 0 2.12z"})]
                                          "PlagiarismTwoTone"))
