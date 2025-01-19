import speedtest

test = speedtest.Speedtest()

download = test.download()

upload = test.upload()

print(f'Download: {download / 1000000}')
print(f'Upload: {upload / 1000000}')