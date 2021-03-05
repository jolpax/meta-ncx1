DESCRIPTION = "An image for network and communication."
LICENSE = "MIT"
PR = "r1"

require atmel-demo-image.inc

IMAGE_INSTALL += "\
    packagegroup-base-usbhost \
    mpg123 \
    mpio \
    "

IMAGE_INSTALL_append_sama5d2 = " nodejs nodejs-npm greengrass"
IMAGE_INSTALL_append_sama5d3 = " nodejs nodejs-npm"
IMAGE_INSTALL_append_sama5d4 = " nodejs nodejs-npm"

IMAGE_INSTALL_append_sama5d2-ptc-ek = " ptc-examples"
IMAGE_INSTALL_append_sama5d2-ptc-ek-sd = " ptc-examples"
IMAGE_INSTALL_append_sama5d27-wlsom1-ek-sd = " ptc-examples nginx \
				wilc-demo-fs-overlay \
				wilc-ble-demo \
				wilc-websocket-demo "

IMAGE_INSTALL_append_sama7g5ek-sd = " bonnie++ iozone3 gstreamer1.0 \
				gstreamer1.0-plugins-bad \
				gstreamer1.0-plugins-good \
				gstreamer1.0-plugins-ugly fswebcam ffmpeg "
