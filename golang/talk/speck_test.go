package talk

//测试包
import "testing"



func TestSayHello(t *testing.T) {
	want := "Hello, go"
	if got := SayHello(); got != want {
		t.Errorf("Hello() = %q, want %q", got, want)
	}
}