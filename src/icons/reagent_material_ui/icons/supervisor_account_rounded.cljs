(ns reagent-material-ui.icons.supervisor-account-rounded
  "Imports @material-ui/icons/SupervisorAccountRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def supervisor-account-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M10.64 15.17v.01-.01c.01 0 0 0 0 0zM22 19v-.41c0-.79-.46-1.53-1.19-1.83-1.17-.49-2.46-.76-3.81-.76s-2.64.27-3.81.76c-.73.3-1.19 1.04-1.19 1.83V19c0 .55.45 1 1 1h8c.55 0 1-.45 1-1zM10 4C7.79 4 6 5.79 6 8s1.79 4 4 4 4-1.79 4-4-1.79-4-4-4z"}) (e "path" #js {"d" "M13 13.4c-1.06-.25-2.12-.4-3-.4-2.67 0-8 1.34-8 4v2c0 .55.45 1 1 1h7v-1.41c0-2.94 2.55-3.72 3-3.88V13.4z"}) (e "circle" #js {"cy" "12.5", "r" "2.5", "cx" "17"}))
                                                 "SupervisorAccountRounded"))
