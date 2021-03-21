(ns reagent-material-ui.icons.browser-not-supported-rounded
  "Imports @material-ui/icons/BrowserNotSupportedRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def browser-not-supported-rounded (create-svg-icon (e "path" #js {"d" "M19 6v10.5l1.95 1.95c.03-.15.05-.3.05-.45V6c0-1.1-.9-2-2-2H6.5l2 2H19zM3.86 3.95c-.35-.35-.92-.35-1.27 0s-.35.92 0 1.27l.41.42V18c0 1.1.9 2 2 2h12.36l1.42 1.42c.35.35.92.35 1.27 0s.35-.92 0-1.27L3.86 3.95zM5 18V7.64L15.36 18H5z"})
                                                    "BrowserNotSupportedRounded"))
