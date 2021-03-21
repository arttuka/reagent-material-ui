(ns reagent-material-ui.icons.support-two-tone
  "Imports @material-ui/icons/SupportTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def support-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M10.3 7.32L9.13 4.54c-2.11.81-3.78 2.48-4.59 4.59l2.78 1.15c.51-1.38 1.6-2.46 2.98-2.96zm-2.98 6.4l-2.78 1.15c.81 2.1 2.48 3.78 4.59 4.59l1.17-2.78c-1.39-.5-2.47-1.59-2.98-2.96zm9.35-3.45l2.78-1.15c-.81-2.1-2.48-3.77-4.58-4.58l-1.15 2.78c1.37.51 2.45 1.58 2.95 2.95zm.01 3.44c-.5 1.37-1.58 2.46-2.95 2.97l1.15 2.78c2.1-.81 3.77-2.48 4.58-4.58l-2.78-1.17z", "opacity" ".3"}) (e "path" #js {"d" "M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm2.87 2.54c2.1.81 3.77 2.48 4.58 4.58l-2.78 1.15c-.51-1.36-1.58-2.44-2.95-2.94l1.15-2.79zm-5.74 0l1.17 2.78c-1.38.5-2.47 1.59-2.98 2.97L4.54 9.13c.81-2.11 2.48-3.78 4.59-4.59zm0 14.92c-2.1-.81-3.78-2.48-4.59-4.59l2.78-1.15c.51 1.38 1.59 2.46 2.97 2.96l-1.16 2.78zM9 12c0-1.66 1.34-3 3-3s3 1.34 3 3-1.34 3-3 3-3-1.34-3-3zm5.88 7.46l-1.15-2.78c1.37-.51 2.45-1.59 2.95-2.97l2.78 1.17c-.81 2.1-2.48 3.77-4.58 4.58z"}))
                                       "SupportTwoTone"))
