public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\uc87f\u51b2\ub102\u7ce1\u527a {
    public void \uc87f\u51b2\ub102\u7ce1\u527a() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:Object(Object::<init>, this:\uc87f\u51b2\ub102\u7ce1\u527a)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static java.util.List<\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\uc2e8\u52d3\u92ff\u516c\u8640> \ua562\u8aa5\ua562\ud51e\ubff1\ufcaf(\u56bd\u8413\u647c\u5bc4\ud158.\u6d69\ua6bd\u718f\uae87\u5f50[] p0) {
        var_1_5F : int
        var_4_64 : int
        var_5_6D : int
        var_3_91 : ArrayList
        var_5_98 : int
        var_6_A1 : int
        var_7_E8 : \u6d69\ua6bd\u718f\uae87\u5f50
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_1_5F = and:int(ldc:int(2009504432), ldc:int(-33611903))
            var_4_64 = arraylength:int(p0:\u6d69\ua6bd\u718f\uae87\u5f50[])
            var_5_6D = and:int(ldc:int(-30785), ldc:int(30784))
            
            loop {
                if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(67108864)), ldc:int(0))) {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(-941162774))
                    
                    if (cmplt:boolean(var_5_6D:int, var_4_64:int)) {
                        invokestatic:int(\uc87f\u51b2\ub102\u7ce1\u527a::\u4f4a\u3dd3\ufe34\u836c\u5db4\u516c, invokestatic:String(\u6d69\ua6bd\u718f\uae87\u5f50::\u965f\u8cae\u4c04\u3776\u5bc4\u8258, loadelement:\u6d69\ua6bd\u718f\uae87\u5f50(p0:\u6d69\ua6bd\u718f\uae87\u5f50[], var_5_6D:int)))
                        inc:int(var_5_6D, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(1073741824)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_91 = invokestatic:ArrayList(Lists::newArrayList)
            var_5_98 = arraylength:int(p0:\u6d69\ua6bd\u718f\uae87\u5f50[])
            var_6_A1 = and:int(ldc:int(5905), ldc:int(-5908))
            
            while (cmplt:boolean(var_6_A1:int, var_5_98:int)) {
                var_7_E8 = loadelement:\u6d69\ua6bd\u718f\uae87\u5f50(p0:\u6d69\ua6bd\u718f\uae87\u5f50[], var_6_A1:int)
                invokeinterface:boolean(List<\uc2e8\u52d3\u92ff\u516c\u8640>::add, var_3_91:ArrayList<\uc2e8\u52d3\u92ff\u516c\u8640>[expected:List<\uc2e8\u52d3\u92ff\u516c\u8640>], initobject:\uc2e8\u52d3\u92ff\u516c\u8640(\uc2e8\u52d3\u92ff\u516c\u8640::<init>, invokestatic:String(\u6d69\ua6bd\u718f\uae87\u5f50::\ub102\u7bad\ua068\ud36e\ud4fe\u67e9, var_7_E8:\u6d69\ua6bd\u718f\uae87\u5f50), invokestatic:int(\uc87f\u51b2\ub102\u7ce1\u527a::\u4f4a\u3dd3\ufe34\u836c\u5db4\u516c, invokestatic:String(\u6d69\ua6bd\u718f\uae87\u5f50::\u965f\u8cae\u4c04\u3776\u5bc4\u8258, var_7_E8:\u6d69\ua6bd\u718f\uae87\u5f50))))
                inc:int(var_6_A1, ldc:int(1))
            }
            
            invokeinterface:void(List<Object>::sort, var_3_91:ArrayList<Object>[expected:List<Object>], invokestatic:Comparator<? super Object>(Comparator<T>::comparingInt, invokedynamic:ToIntFunction<? super Object>(applyAsInt:()Ljava/util/function/ToIntFunction;)))
            return:List<\uc2e8\u52d3\u92ff\u516c\u8640>(var_3_91:ArrayList<Object>)
        }
        
        goto(Label_0006)
    }
    
    private static int \u4f4a\u3dd3\ufe34\u836c\u5db4\u516c(java.lang.String p0) {
        var_1_71 : int
        var_4_73 : long
        var_1_79 : int
        var_6_7B : Socket
        var_7_84 : int
        var_8_9C : InetSocketAddress
        var_9_AF : long
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_1_71 = and:int(and:int(and:int(ldc:int(-1173550909), ldc:int(1958582687)), ldc:int(852068827)), ldc:int(-135410981))
            var_4_73 = ldc:long(0L)
            var_1_79 = and:int(var_1_71:int, ldc:int(871043007))
            var_6_7B = aconstnull:Socket()
            var_7_84 = and:int(ldc:int(-2199), ldc:int(2198))
            
            while (cmplt:boolean(var_7_84:int, xor:int(ldc:int(517), ldc:int(512)))) {
                try {
                    var_8_9C = initobject:InetSocketAddress(InetSocketAddress::<init>, p0:String, ldc:int(80))
                    var_6_7B = initobject:Socket(Socket::<init>)
                    var_1_79 = and:int(var_1_79:int, ldc:int(683399863))
                    var_9_AF = invokestatic:long(\uc87f\u51b2\ub102\u7ce1\u527a::\u99f7\u718f\u4179\ubff1\ua562\u6d99)
                    
                    loop {
                        if (cmpne:boolean(and:int(var_1_79:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0240)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_79:int, ldc:int(128)), ldc:int(0))) {
                            var_1_79 = and:int(var_1_79:int, ldc:int(1000065267))
                            invokevirtual:void(Socket::connect, var_6_7B:Socket, var_8_9C:InetSocketAddress[expected:SocketAddress], and:int(ldc:int(4863), ldc:int(700)))
                        }
                        
                        Label_0210:
                        
                        if (cmpeq:boolean(and:int(var_1_79:int, ldc:int(131072)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_1_79:int, ldc:int(2147483647)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_1_79 = and:int(var_1_79:int, ldc:int(1764346287))
                            var_4_73 = add:long(var_4_73:long, sub:long(invokestatic:long(\uc87f\u51b2\ub102\u7ce1\u527a::\u99f7\u718f\u4179\ubff1\ua562\u6d99), var_9_AF:long))
                        }
                        
                        Label_0240:
                        
                        if (cmpeq:boolean(and:int(var_1_79:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0210)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_79:int, ldc:int(8388608)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                        
                        var_1_79 = and:int(var_1_79:int, ldc:int(-387926412))
                    }
                    
                    var_1_79 = and:int(var_1_79:int, ldc:int(-220201589))
                    invokestatic:void(\uc87f\u51b2\ub102\u7ce1\u527a::\u7af6\u7049\ufcaf\u7ce1\u7ce1\u4daf, var_6_7B:Socket)
                    var_1_79 = and:int(var_1_79:int, ldc:int(862539775))
                }
                catch (java.lang.Exception var_8_11C) {
                    var_4_73 = add:long(var_4_73:long, ldc:long(700L))
                }
                finally {
                    invokestatic:void(\uc87f\u51b2\ub102\u7ce1\u527a::\u7af6\u7049\ufcaf\u7ce1\u7ce1\u4daf, var_6_7B:Socket)
                }
                
                inc:int(var_7_84, ldc:int(1))
            }
            
            return:int(d2i:int(div:double(l2d:double(var_4_73:long), ldc:double(5.0))))
        }
        
        goto(Label_0006)
    }
    
    private static void \u7af6\u7049\ufcaf\u7ce1\u7ce1\u4daf(java.net.Socket p0) {
        var_1_117 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_1_117 = and:int(ldc:int(1717699849), ldc:int(-1339530975))
            
            try {
                loop {
                    if (cmpne:boolean(and:int(var_1_117:int, ldc:int(32768)), ldc:int(0))) {
                        var_1_117 = and:int(var_1_117:int, ldc:int(1968204635))
                        goto(Label_0238)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_117:int, ldc:int(65536)), ldc:int(0))) {
                        var_1_117 = and:int(var_1_117:int, ldc:int(1788629122))
                        goto(Label_0192)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_117:int, ldc:int(32768)), ldc:int(0))) {
                        var_1_117 = and:int(var_1_117:int, ldc:int(-1539689799))
                        
                        if (cmpeq:boolean(p0:Socket, aconstnull:Socket())) {
                            goto(Label_0238)
                        }
                    }
                    
                    Label_0142:
                    
                    if (cmpne:boolean(and:int(var_1_117:int, ldc:int(16384)), ldc:int(0))) {
                        var_1_117 = and:int(var_1_117:int, ldc:int(751634640))
                        goto(Label_0238)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_117:int, ldc:int(8388608)), ldc:int(0))) {
                        var_1_117 = and:int(var_1_117:int, ldc:int(1514381589))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_1_117:int, ldc:int(8192)), ldc:int(0))) {
                            var_1_117 = and:int(var_1_117:int, ldc:int(-174480305))
                            loopcontinue()
                        }
                        
                        var_1_117 = and:int(var_1_117:int, ldc:int(799496085))
                    }
                    
                    Label_0192:
                    
                    if (cmpne:boolean(and:int(var_1_117:int, ldc:int(268435456)), ldc:int(0))) {
                        var_1_117 = and:int(var_1_117:int, ldc:int(-2055523448))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_1_117:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0142)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_117:int, ldc:int(32768)), ldc:int(0))) {
                            var_1_117 = and:int(var_1_117:int, ldc:int(-611565218))
                            loopcontinue()
                        }
                        
                        var_1_117 = and:int(var_1_117:int, ldc:int(653374745))
                        invokevirtual:void(Socket::close, p0:Socket)
                    }
                    
                    Label_0238:
                    
                    if (cmpeq:boolean(and:int(var_1_117:int, ldc:int(2097152)), ldc:int(0))) {
                        var_1_117 = and:int(var_1_117:int, ldc:int(588126259))
                        goto(Label_0192)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_117:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0142)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_117:int, ldc:int(2097152)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_1_117 = and:int(var_1_117:int, ldc:int(1824126989))
                }
                
                var_1_117 = and:int(var_1_117:int, ldc:int(1692730601))
            }
            catch (java.lang.Throwable stack_11F_0) {
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static long \u99f7\u718f\u4179\ubff1\ua562\u6d99() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:long(invokestatic:long(\ud217\u3504\u760c\uc29a\u97e6\ube23::\uc3e3\u99f7\u4c2b\u7af6\u8d90\u7d52))
        }
        
        goto(Label_0006)
    }
    
    public static java.util.List<\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\uc2e8\u52d3\u92ff\u516c\u8640> \uf9c5\ucef1\u4daf\ud36e\uc246\u3776() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:List<\uc2e8\u52d3\u92ff\u516c\u8640>(invokestatic:List<\uc2e8\u52d3\u92ff\u516c\u8640>(\uc87f\u51b2\ub102\u7ce1\u527a::\ua562\u8aa5\ua562\ud51e\ubff1\ufcaf, invokestatic:\u6d69\ua6bd\u718f\uae87\u5f50[](\u6d69\ua6bd\u718f\uae87\u5f50::values)))
        }
        
        goto(Label_0006)
    }
    
    static {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6198\u836c\u99f7\uc246\u4daf\u4ab3(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_632 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_63D : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_632 = and:int(ldc:int(657224056), ldc:int(-1520853608))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc87f\u51b2\ub102\u7ce1\u527a[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_632 = and:int(var_3_632:int, ldc:int(1189982039))
            var_5_7D = and:int(ldc:int(-10483), ldc:int(10482))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-23806), ldc:int(23757)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_632:int, ldc:int(-447830682))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(4290), ldc:int(4291)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(27745), ldc:int(405)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_632 = and:int(var_3_CA:int, ldc:int(-1804812999))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(5505), ldc:int(49)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1478)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(4)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-2096905376))
                        goto(Label_1336)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(1501674975))
                        goto(Label_1198)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1099)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0927)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0799)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0656)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-815212786))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0528)
                            }
                            
                            goto(Label_0799)
                        }
                    }
                    
                    Label_0368:
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1478)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(4)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-1994700728))
                        goto(Label_1336)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-799845782))
                        goto(Label_1198)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1099)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0927)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-54733256))
                        goto(Label_0799)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0656)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(2043761675))
                            loopcontinue()
                        }
                        
                        var_3_632 = and:int(var_3_632:int, ldc:int(-1239624328))
                        var_11_DB = and:int(ldc:int(17393), ldc:int(-18424))
                        goto(Label_1467)
                    }
                    
                    Label_0528:
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-560388492))
                        goto(Label_1478)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(256)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-1950018086))
                        goto(Label_1336)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1198)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1099)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0927)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0799)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(752465174))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(1)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(1437302012))
                            goto(Label_0368)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(1)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(326532887))
                            loopcontinue()
                        }
                        
                        var_3_632 = and:int(var_3_632:int, ldc:int(-1108781182))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0799)
                        }
                    }
                    
                    Label_0656:
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(256)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-1280307261))
                        goto(Label_1478)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1336)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(4)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-445543215))
                        goto(Label_1198)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1099)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0927)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(5196830))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(2112504446))
                            goto(Label_0528)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(662471986))
                            goto(Label_0368)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(-1972678060))
                            loopcontinue()
                        }
                        
                        var_3_632 = and:int(var_3_632:int, ldc:int(-1386478720))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0799:
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1478)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(4)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-1401648148))
                        goto(Label_1336)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(943805953))
                        goto(Label_1198)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(628180136))
                        goto(Label_1099)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(256)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-789097216))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(982432497))
                            goto(Label_0656)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0528)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0368)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_632 = and:int(var_3_632:int, ldc:int(-20315233))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(-15356), ldc:int(-15355))
                                goto(Label_1099)
                            }
                        }
                    }
                    
                    Label_0927:
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1478)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1336)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(256)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(493362807))
                        goto(Label_1198)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(4)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-2039442768))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(-74980279))
                            goto(Label_0799)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(237621368))
                            goto(Label_0656)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(1)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(1359493674))
                            goto(Label_0528)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(-1562817257))
                            goto(Label_0368)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_632 = and:int(var_3_632:int, ldc:int(-1372736698))
                        var_11_DB = and:int(ldc:int(-24407), ldc:int(21316))
                    }
                    
                    Label_1099:
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1478)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1336)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-292403476))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0927)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0799)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0656)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(-559973583))
                            goto(Label_0528)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0368)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_632 = and:int(var_3_632:int, ldc:int(376191915))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1336)
                            }
                        }
                    }
                    
                    Label_1198:
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-269430926))
                        goto(Label_1478)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(1520148939))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(1336020542))
                            goto(Label_1099)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0927)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(1404643649))
                            goto(Label_0799)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(4)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(706190090))
                            goto(Label_0656)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0528)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0368)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(532648835))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1467)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1336:
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1478)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(4)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-1638172009))
                        goto(Label_1198)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(1453263950))
                        goto(Label_1099)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0927)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0799)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(1203579937))
                        goto(Label_0656)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(4)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(1500996341))
                        goto(Label_0528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0368)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(256)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_632 = and:int(var_3_632:int, ldc:int(1691037067))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1467:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_63D = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1478:
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1336)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(256)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(1077448539))
                        goto(Label_1198)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(256)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(1696446520))
                        goto(Label_1099)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0927)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0799)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0656)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(1549389623))
                        goto(Label_0528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0368)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(1)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(1153171805))
                        var_17_63D = add:int(var_16_109:int, xor:int(ldc:int(2584), ldc:int(2585)))
                        looporswitchbreak()
                    }
                    
                    var_3_632 = and:int(var_3_632:int, ldc:int(-844053077))
                }
                
                var_3_632 = and:int(var_3_632:int, ldc:int(-1517294241))
                
                if (cmple:boolean(var_5_7D = var_17_63D:int, sub:int(var_6_84:int, and:int(ldc:int(16517), ldc:int(2081))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(256)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
