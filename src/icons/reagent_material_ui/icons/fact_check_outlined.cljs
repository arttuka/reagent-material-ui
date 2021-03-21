(ns reagent-material-ui.icons.fact-check-outlined
  "Imports @material-ui/icons/FactCheckOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def fact-check-outlined (create-svg-icon (e react/Fragment nil (e "g" #js {"fillRule" "evenodd"} (e "path" #js {"d" "M20 3H4c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 16H4V5h16v14z"}) (e "path" #js {"d" "M19.41 10.42L17.99 9l-3.17 3.17-1.41-1.42L12 12.16 14.82 15zM5 7h5v2H5zm0 4h5v2H5zm0 4h5v2H5z"})))
                                          "FactCheckOutlined"))
