(ns reagent-mui.icons.add-business-outlined
  "Imports @mui/icons-material/AddBusinessOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def add-business-outlined (create-svg-icon [(e "path" #js {"d" "M2 4h15v2H2zm13 13h2v-3h1v-2l-1-5H2l-1 5v2h1v6h9v-6h4v3zm-6 1H4v-4h5v4zm-5.96-6 .6-3h11.72l.6 3H3.04z"}) (e "path" #js {"d" "M23 18h-3v-3h-2v3h-3v2h3v3h2v-3h3z"})]
                                            "AddBusinessOutlined"))
