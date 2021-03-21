(ns reagent-material-ui.icons.help-rounded
  "Imports @material-ui/icons/HelpRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def help-rounded (create-svg-icon (e "path" #js {"d" "M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm-.15 16c-.7 0-1.26-.56-1.26-1.26 0-.71.56-1.25 1.26-1.25.71 0 1.25.54 1.25 1.25 0 .69-.54 1.26-1.25 1.26zm3.01-7.4c-.76 1.11-1.48 1.46-1.87 2.17-.09.17-.15.31-.19.59-.06.46-.43.82-.9.82h-.04c-.53 0-.95-.45-.9-.98.03-.33.11-.68.3-1 .49-.87 1.42-1.39 1.96-2.16.57-.81.25-2.33-1.37-2.33-.74 0-1.21.39-1.51.85-.22.34-.68.46-1.07.3-.5-.21-.72-.83-.41-1.29C9.47 6.66 10.49 6 11.83 6c1.48 0 2.49.67 3.01 1.52.44.72.7 2.07.02 3.08z"})
                                   "HelpRounded"))
