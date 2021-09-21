(ns reagent-mui.icons.article-outlined
  "Imports @mui/icons-material/ArticleOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def article-outlined (create-svg-icon [(e "path" #js {"d" "M19 5v14H5V5h14m0-2H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2z"}) (e "path" #js {"d" "M14 17H7v-2h7v2zm3-4H7v-2h10v2zm0-4H7V7h10v2z"})]
                                       "ArticleOutlined"))
