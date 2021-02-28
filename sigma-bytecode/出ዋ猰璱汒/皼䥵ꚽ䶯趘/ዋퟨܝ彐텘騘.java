public class \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u12cb\ud7e8\u071d\u5f50\ud158\u9a18 {
    public void \u12cb\ud7e8\u071d\u5f50\ud158\u9a18(java.nio.channels.SocketChannel p0, javax.net.ssl.SSLEngine p1, java.util.concurrent.ExecutorService p2, java.nio.channels.SelectionKey p3) {
        var_7_13F : IOException
        
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
        invokespecial:Object(Object::<init>, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18)
        
        if (logicalor:boolean(logicalor:boolean(cmpeq:boolean(p0:SocketChannel, aconstnull:SocketChannel()), cmpeq:boolean(p1:SSLEngine, aconstnull:SSLEngine())), cmpeq:boolean(getfield:ExecutorService(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u156b\u7c6b\u3e75\ubff1\ubb2b\u4492, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18), p2:ExecutorService))) {
            athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u8aa5\u34df\ub32d\ud36e\u8d98\u8350), and:int(ldc:int(-21069), ldc:int(21068)))))
        }
        
        putfield:SocketChannel(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u156b\u7af6\u8d90\u9255\u983f\u69d9, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18, p0:SocketChannel)
        putfield:SSLEngine(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3d4b\u392e\ud12e\u71ae\u8709\u6198, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18, p1:SSLEngine)
        putfield:ExecutorService(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u156b\u7c6b\u3e75\ubff1\ubb2b\u4492, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18, p2:ExecutorService)
        putfield:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\ubefe\u4ab3\ubcb0\u34df\u6198\u983f, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18, invokestatic:ByteBuffer(ByteBuffer::allocate, invokeinterface:int(SSLSession::getPacketBufferSize, invokevirtual:SSLSession(SSLEngine::getSession, getfield:SSLEngine(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3d4b\u392e\ud12e\u71ae\u8709\u6198, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18)))))
        putfield:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\uc2bd\u0c95\u64ab\u5bc4\u72f1\u624e, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18, invokestatic:ByteBuffer(ByteBuffer::allocate, invokeinterface:int(SSLSession::getPacketBufferSize, invokevirtual:SSLSession(SSLEngine::getSession, getfield:SSLEngine(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3d4b\u392e\ud12e\u71ae\u8709\u6198, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18)))))
        invokevirtual:void(SSLEngine::beginHandshake, getfield:SSLEngine(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3d4b\u392e\ud12e\u71ae\u8709\u6198, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))
        
        if (invokespecial:boolean(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u2dcc\ua562\ubb2b\u3c25\u9033\u5bc4, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18)) {
            if (cmpne:boolean(p3:SelectionKey, aconstnull:SelectionKey())) {
                invokevirtual:SelectionKey(SelectionKey::interestOps, p3:SelectionKey, or:int(invokevirtual:int(SelectionKey::interestOps, p3:SelectionKey), xor:int(ldc:int(4112), ldc:int(4116))))
            }
        }
        else {
            try {
                invokevirtual:void(AbstractInterruptibleChannel::close, getfield:SocketChannel[expected:AbstractInterruptibleChannel](\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u156b\u7af6\u8d90\u9255\u983f\u69d9, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))
            }
            catch (java.io.IOException var_7_13F) {
                invokevirtual:void(Throwable::printStackTrace, var_7_13F:IOException[expected:Throwable])
            }
        }
    }
    
    public synchronized int read(java.nio.ByteBuffer p0) {
        var_2_5F : int
        var_2_72C : int
        var_4_2B6 : int
        var_5_6C8 : SSLEngineResult
        var_6_71E : SSLException
        
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
        var_2_5F = and:int(ldc:int(1138711734), ldc:int(-872450531))
        
        loop {
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0596)
            }
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0488)
            }
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0409)
            }
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(67108864)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-98270485))
                goto(Label_0330)
            }
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0229)
            }
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(64)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(871693887))
                
                if (invokevirtual:boolean(Buffer::hasRemaining, p0:ByteBuffer[expected:Buffer])) {
                    if (invokevirtual:boolean(Buffer::hasRemaining, getfield:ByteBuffer[expected:Buffer](\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3dd3\u071d\u62da\ub113\ubf56\u69d9, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))) {
                        goto(Label_0330)
                    }
                    
                    invokevirtual:ByteBuffer(ByteBuffer::compact, getfield:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\uc2bd\u0c95\u64ab\u5bc4\u72f1\u624e, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))
                    goto(Label_0596)
                }
            }
            
            Label_0158:
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(4)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(1044052286))
                goto(Label_0596)
            }
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0488)
            }
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0409)
            }
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(1024)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-865305567))
                goto(Label_0330)
            }
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(4194304)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(1024)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(1484600039))
                    loopcontinue()
                }
                
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1946886459))
            }
            
            Label_0229:
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(1024)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(1021574314))
                goto(Label_0596)
            }
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(4)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-192170329))
                goto(Label_0488)
            }
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(64)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-42683989))
                goto(Label_0409)
            }
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(1024)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(4096)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-1113616457))
                    goto(Label_0158)
                }
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(67108864)), ldc:int(0))) {
                    return:int(and:int(ldc:int(12586), ldc:int(-13115)))
                }
                
                loopcontinue()
            }
            
            Label_0330:
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(1)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-805330809))
                goto(Label_0596)
            }
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(1048576)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(597960221))
                goto(Label_0488)
            }
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(16384)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(1713412612))
                    goto(Label_0229)
                }
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(16777216)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(1257121380))
                    goto(Label_0158)
                }
                
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(1)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_5F = and:int(var_2_5F:int, ldc:int(201326237))
            }
            
            Label_0409:
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0596)
            }
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(4)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(1500556381))
            }
            else {
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0330)
                }
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(1024)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-2135675039))
                    goto(Label_0229)
                }
                
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_0158)
                }
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(4194304)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(181652381))
                    loopcontinue()
                }
                
                var_2_5F = and:int(var_2_5F:int, ldc:int(-942279412))
                invokevirtual:Buffer(Buffer::flip, getfield:ByteBuffer[expected:Buffer](\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3dd3\u071d\u62da\ub113\ubf56\u69d9, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))
            }
            
            Label_0488:
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(4194304)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-131956532))
            }
            else {
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(33554432)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-278053207))
                    goto(Label_0409)
                }
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(4)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(328208538))
                    goto(Label_0330)
                }
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_0229)
                }
                
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(8192)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-539042186))
                    goto(Label_0158)
                }
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(8388608)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(1969291162))
                    loopcontinue()
                }
                
                return:int(invokestatic:int(\u120d\uc238\u9937\ub18d\ubcb0\u40a9::\ub8be\u99f7\u5245\u873d\ub18d\ud217, getfield:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3dd3\u071d\u62da\ub113\ubf56\u69d9, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18), p0:ByteBuffer))
            }
            
            Label_0596:
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(262144)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(1502560971))
                goto(Label_0488)
            }
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(4194304)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(304323023))
                goto(Label_0409)
            }
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(8192)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1304200475))
                goto(Label_0330)
            }
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0229)
            }
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(8388608)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1963640157))
                goto(Label_0158)
            }
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(4096)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1534318954))
            }
            else {
                var_2_72C = and:int(var_2_5F:int, ldc:int(-136905660))
                var_4_2B6 = invokevirtual:int(SocketChannel::read, getfield:SocketChannel(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u156b\u7af6\u8d90\u9255\u983f\u69d9, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18), getfield:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\uc2bd\u0c95\u64ab\u5bc4\u72f1\u624e, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))
                
                loop {
                    Label_0696:
                    
                    if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(4194304)), ldc:int(0))) {
                        var_2_72C = and:int(var_2_72C:int, ldc:int(-1312747735))
                        goto(Label_2594)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_2496)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_2_72C = and:int(var_2_72C:int, ldc:int(-1570297326))
                        goto(Label_2384)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(16384)), ldc:int(0))) {
                            var_2_72C = and:int(var_2_72C:int, ldc:int(-1276145411))
                            goto(Label_1475)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_1344)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(4)), ldc:int(0))) {
                            var_2_72C = and:int(var_2_72C:int, ldc:int(-1150800691))
                            goto(Label_1211)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(4096)), ldc:int(0))) {
                            var_2_72C = and:int(var_2_72C:int, ldc:int(1105508235))
                            goto(Label_1088)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(64)), ldc:int(0))) {
                            var_2_72C = and:int(var_2_72C:int, ldc:int(-726510351))
                            goto(Label_0965)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(8192)), ldc:int(0))) {
                            var_2_72C = and:int(var_2_72C:int, ldc:int(-1142095787))
                            goto(Label_0832)
                        }
                        
                        var_2_72C = and:int(var_2_72C:int, ldc:int(938893270))
                        
                        if (cmple:boolean(var_4_2B6:int, ldc:int(0))) {
                            goto(Label_0832)
                        }
                        
                        goto(Label_1088)
                    }
                    
                    loop {
                        Block_115:
                        
                        try {
                            Label_1606:
                            
                            if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(4194304)), ldc:int(0))) {
                                goto(Label_2594)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(1)), ldc:int(0))) {
                                goto(Label_2496)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(1024)), ldc:int(0))) {
                                goto(Label_2384)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(536870912)), ldc:int(0))) {
                                goto(Label_1475)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(4096)), ldc:int(0))) {
                                var_2_72C = and:int(var_2_72C:int, ldc:int(246902433))
                                goto(Label_1344)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(4194304)), ldc:int(0))) {
                                goto(Label_1211)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(8388608)), ldc:int(0))) {
                                var_2_72C = and:int(var_2_72C:int, ldc:int(-1112866933))
                                goto(Label_1088)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(1048576)), ldc:int(0))) {
                                var_2_72C = and:int(var_2_72C:int, ldc:int(-1322864162))
                                goto(Label_0965)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(64)), ldc:int(0))) {
                                var_2_72C = and:int(var_2_72C:int, ldc:int(-1908984729))
                                looporswitchbreak()
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(2147483647)), ldc:int(0))) {
                                var_2_72C = and:int(var_2_72C:int, ldc:int(-1759567407))
                                loopcontinue(Label_0696)
                            }
                            
                            var_2_72C = and:int(var_2_72C:int, ldc:int(335476134))
                            var_5_6C8 = invokevirtual:SSLEngineResult(SSLEngine::unwrap, getfield:SSLEngine(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3d4b\u392e\ud12e\u71ae\u8709\u6198, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18), getfield:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\uc2bd\u0c95\u64ab\u5bc4\u72f1\u624e, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18), getfield:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3dd3\u071d\u62da\ub113\ubf56\u69d9, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))
                            Label_1738:
                            
                            if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(2147483647)), ldc:int(0))) {
                                var_2_72C = and:int(var_2_72C:int, ldc:int(1702604895))
                                goto(Label_2252)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(4)), ldc:int(0))) {
                                goto(Label_2188)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(16777216)), ldc:int(0))) {
                                var_2_72C = and:int(var_2_72C:int, ldc:int(-2080528550))
                                goto(Label_2097)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(33554432)), ldc:int(0))) {
                                var_2_72C = and:int(var_2_72C:int, ldc:int(-259852007))
                                goto(Label_2004)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(16777216)), ldc:int(0))) {
                                var_2_72C = and:int(var_2_72C:int, ldc:int(-2060244739))
                                goto(Label_1924)
                            }
                            
                            var_2_72C = and:int(var_2_72C:int, ldc:int(1475794590))
                        }
                        catch (javax.net.ssl.SSLException var_6_71E) {
                            do {
                                if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(4096)), ldc:int(0))) {
                                    var_2_72C = and:int(var_2_72C:int, ldc:int(82668538))
                                }
                                else {
                                    var_2_72C = and:int(var_2_72C:int, ldc:int(-1611311745))
                                    invokevirtual:void(Throwable::printStackTrace, var_6_71E:SSLException[expected:Throwable])
                                }
                            } while (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(4194304)), ldc:int(0)))
                            
                            athrow(var_6_71E:SSLException)
                        }
                        
                        switch (loadelement:int(getstatic:int[](\uf9c5\u4d85\u3e2a\ub6ab\u416d\ub1b9::\u392e\ud4fe\uc238\u071d\u839e\ub8be), invokevirtual:int(Enum<E>::ordinal, invokevirtual:Status(SSLEngineResult::getStatus, var_5_6C8:SSLEngineResult)))) {
                            case 1:
                                invokevirtual:Buffer(Buffer::flip, getfield:ByteBuffer[expected:Buffer](\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3dd3\u071d\u62da\ub113\ubf56\u69d9, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))
                                looporswitchbreak()
                            
                            case 2:
                                invokevirtual:Buffer(Buffer::flip, getfield:ByteBuffer[expected:Buffer](\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3dd3\u071d\u62da\ub113\ubf56\u69d9, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))
                                goto(Label_2004)
                            
                            case 3:
                                putfield:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3dd3\u071d\u62da\ub113\ubf56\u69d9, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18, invokespecial:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\ua6bd\ud7e8\u839e\u4975\uf995\u12b2, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18, getfield:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3dd3\u071d\u62da\ub113\ubf56\u69d9, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18)))
                                goto(Label_2097)
                            
                            case 4:
                                invokespecial:void(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\ufcaf\u8cae\u8640\uc84e\u8aa5\ucb79, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18)
                                goto(Label_2188)
                            
                            default:
                                athrow(initobject:IllegalStateException(IllegalStateException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u8aa5\u34df\ub32d\ud36e\u8d98\u8350), xor:int(ldc:int(-32752), ldc:int(-32751)))), invokevirtual:Status(SSLEngineResult::getStatus, var_5_6C8:SSLEngineResult)))))
                        }
                        
                        Label_1924:
                        
                        if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_2252)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(1)), ldc:int(0))) {
                            var_2_72C = and:int(var_2_72C:int, ldc:int(49025192))
                            goto(Label_2188)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(67108864)), ldc:int(0))) {
                            var_2_72C = and:int(var_2_72C:int, ldc:int(-1576608190))
                            goto(Label_2097)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(1048576)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(33554432)), ldc:int(0))) {
                                return:int(invokestatic:int(\u120d\uc238\u9937\ub18d\ubcb0\u40a9::\ub8be\u99f7\u5245\u873d\ub18d\ud217, getfield:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3dd3\u071d\u62da\ub113\ubf56\u69d9, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18), p0:ByteBuffer))
                            }
                            
                            goto(Label_1738)
                        }
                        
                        Label_2004:
                        
                        if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(4194304)), ldc:int(0))) {
                            var_2_72C = and:int(var_2_72C:int, ldc:int(-1723411836))
                            goto(Label_2252)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_2188)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(8388608)), ldc:int(0))) {
                            var_2_72C = and:int(var_2_72C:int, ldc:int(1424880844))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(16777216)), ldc:int(0))) {
                                goto(Label_1924)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(16384)), ldc:int(0))) {
                                var_2_72C = and:int(var_2_72C:int, ldc:int(-1669641584))
                                goto(Label_1738)
                            }
                            
                            return:int(invokestatic:int(\u120d\uc238\u9937\ub18d\ubcb0\u40a9::\ub8be\u99f7\u5245\u873d\ub18d\ud217, getfield:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3dd3\u071d\u62da\ub113\ubf56\u69d9, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18), p0:ByteBuffer))
                        }
                        
                        Label_2097:
                        
                        if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(1024)), ldc:int(0))) {
                            var_2_72C = and:int(var_2_72C:int, ldc:int(-1614780718))
                            goto(Label_2252)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(8388608)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(1024)), ldc:int(0))) {
                                var_2_72C = and:int(var_2_72C:int, ldc:int(-1878577888))
                                goto(Label_2004)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(16777216)), ldc:int(0))) {
                                var_2_72C = and:int(var_2_72C:int, ldc:int(-1604880311))
                                goto(Label_1924)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(8388608)), ldc:int(0))) {
                                var_2_72C = and:int(var_2_72C:int, ldc:int(293307780))
                                goto(Label_1738)
                            }
                            
                            return:int(invokevirtual:int(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::read, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18, p0:ByteBuffer))
                        }
                        
                        Label_2188:
                        
                        if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(1048576)), ldc:int(0))) {
                            var_2_72C = and:int(var_2_72C:int, ldc:int(815880011))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(1024)), ldc:int(0))) {
                                var_2_72C = and:int(var_2_72C:int, ldc:int(-138440539))
                                goto(Label_2097)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(256)), ldc:int(0))) {
                                goto(Label_2004)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(16777216)), ldc:int(0))) {
                                goto(Label_1924)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(262144)), ldc:int(0))) {
                                goto(Label_1738)
                            }
                            
                            var_2_72C = and:int(var_2_72C:int, ldc:int(-1812695435))
                            invokevirtual:Buffer(Buffer::clear, p0:ByteBuffer[expected:Buffer])
                        }
                        
                        Label_2252:
                        
                        if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(1024)), ldc:int(0))) {
                            var_2_72C = and:int(var_2_72C:int, ldc:int(1182625811))
                            goto(Label_2188)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(16384)), ldc:int(0))) {
                            var_2_72C = and:int(var_2_72C:int, ldc:int(1561505946))
                            goto(Label_2097)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_2004)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(8192)), ldc:int(0))) {
                            var_2_72C = and:int(var_2_72C:int, ldc:int(64681184))
                            goto(Label_1924)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(1)), ldc:int(0))) {
                            var_2_72C = and:int(var_2_72C:int, ldc:int(-2040395064))
                            goto(Label_1738)
                        }
                        
                        return:int(ldc:int(-1))
                    }
                    
                    Label_0832:
                    
                    if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_2594)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(1048576)), ldc:int(0))) {
                        var_2_72C = and:int(var_2_72C:int, ldc:int(-756512129))
                        goto(Label_2496)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(67108864)), ldc:int(0))) {
                        var_2_72C = and:int(var_2_72C:int, ldc:int(1496539848))
                        goto(Label_2384)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(8192)), ldc:int(0))) {
                        var_2_72C = and:int(var_2_72C:int, ldc:int(1657482782))
                        goto(Label_1606)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_2_72C = and:int(var_2_72C:int, ldc:int(-918992616))
                        goto(Label_1475)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1344)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(67108864)), ldc:int(0))) {
                        var_2_72C = and:int(var_2_72C:int, ldc:int(172396044))
                        goto(Label_1211)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1088)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(4096)), ldc:int(0))) {
                        var_2_72C = and:int(var_2_72C:int, ldc:int(119553524))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_2_72C = and:int(var_2_72C:int, ldc:int(133584895))
                        
                        if (logicalnot:boolean(invokevirtual:boolean(Buffer::hasRemaining, getfield:ByteBuffer[expected:Buffer](\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\uc2bd\u0c95\u64ab\u5bc4\u72f1\u624e, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18)))) {
                            if (cmplt:boolean(var_4_2B6:int, ldc:int(0))) {
                                goto(Label_2384)
                            }
                            
                            goto(Label_2594)
                        }
                    }
                    
                    Label_0965:
                    
                    if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_2594)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_2_72C = and:int(var_2_72C:int, ldc:int(-863314152))
                        goto(Label_2496)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_2384)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(1048576)), ldc:int(0))) {
                        var_2_72C = and:int(var_2_72C:int, ldc:int(-125694648))
                        goto(Label_1606)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1475)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_2_72C = and:int(var_2_72C:int, ldc:int(785634637))
                        goto(Label_1344)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(256)), ldc:int(0))) {
                        var_2_72C = and:int(var_2_72C:int, ldc:int(-1382623855))
                        goto(Label_1211)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(8192)), ldc:int(0))) {
                        var_2_72C = and:int(var_2_72C:int, ldc:int(957030411))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0832)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(256)), ldc:int(0))) {
                            var_2_72C = and:int(var_2_72C:int, ldc:int(-1270961343))
                            loopcontinue()
                        }
                        
                        var_2_72C = and:int(var_2_72C:int, ldc:int(1006010196))
                    }
                    
                    Label_1088:
                    
                    if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(1)), ldc:int(0))) {
                        var_2_72C = and:int(var_2_72C:int, ldc:int(-2112153204))
                        goto(Label_2594)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_2496)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_2384)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(4194304)), ldc:int(0))) {
                        var_2_72C = and:int(var_2_72C:int, ldc:int(288034822))
                        goto(Label_1606)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(64)), ldc:int(0))) {
                        var_2_72C = and:int(var_2_72C:int, ldc:int(1203077337))
                        goto(Label_1475)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1344)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(8388608)), ldc:int(0))) {
                        var_2_72C = and:int(var_2_72C:int, ldc:int(619218010))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0965)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0832)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(256)), ldc:int(0))) {
                            var_2_72C = and:int(var_2_72C:int, ldc:int(-912665449))
                            loopcontinue()
                        }
                        
                        var_2_72C = and:int(var_2_72C:int, ldc:int(1137999566))
                        invokevirtual:Buffer(Buffer::flip, getfield:ByteBuffer[expected:Buffer](\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\uc2bd\u0c95\u64ab\u5bc4\u72f1\u624e, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))
                    }
                    
                    Label_1211:
                    
                    if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(8388608)), ldc:int(0))) {
                        var_2_72C = and:int(var_2_72C:int, ldc:int(-1898236862))
                        goto(Label_2594)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_2_72C = and:int(var_2_72C:int, ldc:int(839767020))
                        goto(Label_2496)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_2_72C = and:int(var_2_72C:int, ldc:int(-1101425983))
                        goto(Label_2384)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1606)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(262144)), ldc:int(0))) {
                        var_2_72C = and:int(var_2_72C:int, ldc:int(-1006734084))
                        goto(Label_1475)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_1088)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(67108864)), ldc:int(0))) {
                            var_2_72C = and:int(var_2_72C:int, ldc:int(1896703757))
                            goto(Label_0965)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0832)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(256)), ldc:int(0))) {
                            var_2_72C = and:int(var_2_72C:int, ldc:int(14066595))
                            loopcontinue()
                        }
                        
                        var_2_72C = and:int(var_2_72C:int, ldc:int(-1814145124))
                        
                        if (logicalnot:boolean(invokevirtual:boolean(Buffer::hasRemaining, getfield:ByteBuffer[expected:Buffer](\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\uc2bd\u0c95\u64ab\u5bc4\u72f1\u624e, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18)))) {
                            goto(Label_2594)
                        }
                    }
                    
                    Label_1344:
                    
                    if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_2_72C = and:int(var_2_72C:int, ldc:int(1181716811))
                        goto(Label_2594)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(1024)), ldc:int(0))) {
                        var_2_72C = and:int(var_2_72C:int, ldc:int(-859315623))
                        goto(Label_2496)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_2_72C = and:int(var_2_72C:int, ldc:int(1608297275))
                        goto(Label_2384)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1606)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(16384)), ldc:int(0))) {
                        var_2_72C = and:int(var_2_72C:int, ldc:int(-1434816542))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_1211)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(67108864)), ldc:int(0))) {
                            var_2_72C = and:int(var_2_72C:int, ldc:int(627059113))
                            goto(Label_1088)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(4)), ldc:int(0))) {
                            var_2_72C = and:int(var_2_72C:int, ldc:int(-1435752709))
                            goto(Label_0965)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0832)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_2_72C = and:int(var_2_72C:int, ldc:int(1578578098))
                            loopcontinue()
                        }
                        
                        var_2_72C = and:int(var_2_72C:int, ldc:int(-402653513))
                    }
                    
                    Label_1475:
                    
                    if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(262144)), ldc:int(0))) {
                        var_2_72C = and:int(var_2_72C:int, ldc:int(-676017367))
                        goto(Label_2594)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_2496)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_1606)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(4)), ldc:int(0))) {
                            var_2_72C = and:int(var_2_72C:int, ldc:int(151737391))
                            goto(Label_1344)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(16384)), ldc:int(0))) {
                            var_2_72C = and:int(var_2_72C:int, ldc:int(-980851050))
                            goto(Label_1211)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(64)), ldc:int(0))) {
                            var_2_72C = and:int(var_2_72C:int, ldc:int(-346635248))
                            goto(Label_1088)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(64)), ldc:int(0))) {
                            var_2_72C = and:int(var_2_72C:int, ldc:int(2076083190))
                            goto(Label_0965)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(536870912)), ldc:int(0))) {
                            var_2_72C = and:int(var_2_72C:int, ldc:int(-1418936793))
                            goto(Label_0832)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(64)), ldc:int(0))) {
                            var_2_72C = and:int(var_2_72C:int, ldc:int(1943960804))
                            invokevirtual:ByteBuffer(ByteBuffer::compact, getfield:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3dd3\u071d\u62da\ub113\ubf56\u69d9, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))
                            goto(Block_115)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_2384:
                    
                    if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(1048576)), ldc:int(0))) {
                        var_2_72C = and:int(var_2_72C:int, ldc:int(987538334))
                        goto(Label_2594)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_1606)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_1475)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(1)), ldc:int(0))) {
                            var_2_72C = and:int(var_2_72C:int, ldc:int(1438977719))
                            goto(Label_1344)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_1211)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_1088)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0965)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(64)), ldc:int(0))) {
                            var_2_72C = and:int(var_2_72C:int, ldc:int(-1277229739))
                            goto(Label_0832)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(1048576)), ldc:int(0))) {
                            var_2_72C = and:int(var_2_72C:int, ldc:int(907031494))
                            loopcontinue()
                        }
                        
                        var_2_72C = and:int(var_2_72C:int, ldc:int(1811699508))
                    }
                    
                    Label_2496:
                    
                    if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(4)), ldc:int(0))) {
                        var_2_72C = and:int(var_2_72C:int, ldc:int(-99467644))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_2384)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_1606)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_1475)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_1344)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_1211)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_1088)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0965)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0832)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(1)), ldc:int(0))) {
                            var_2_72C = and:int(var_2_72C:int, ldc:int(-852991077))
                            loopcontinue()
                        }
                        
                        var_2_72C = and:int(var_2_72C:int, ldc:int(803200630))
                        invokespecial:void(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\ubefe\u0800\u5245\u960f\u0a06\u3d4b, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18)
                    }
                    
                    Label_2594:
                    
                    if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(262144)), ldc:int(0))) {
                        var_2_72C = and:int(var_2_72C:int, ldc:int(385673474))
                        goto(Label_2496)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_2_72C = and:int(var_2_72C:int, ldc:int(-1320991026))
                        goto(Label_2384)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1606)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(8192)), ldc:int(0))) {
                        var_2_72C = and:int(var_2_72C:int, ldc:int(-1996658005))
                        goto(Label_1475)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1344)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1211)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_72C:int, ldc:int(4)), ldc:int(0))) {
                        var_2_72C = and:int(var_2_72C:int, ldc:int(-266934655))
                        goto(Label_1088)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(8192)), ldc:int(0))) {
                        var_2_72C = and:int(var_2_72C:int, ldc:int(312564913))
                        goto(Label_0965)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_2_72C = and:int(var_2_72C:int, ldc:int(-66343727))
                        goto(Label_0832)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_72C:int, ldc:int(262144)), ldc:int(0))) {
                        invokestatic:int(\u120d\uc238\u9937\ub18d\ubcb0\u40a9::\ub8be\u99f7\u5245\u873d\ub18d\ud217, getfield:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3dd3\u071d\u62da\ub113\ubf56\u69d9, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18), p0:ByteBuffer)
                        return:int(var_4_2B6:int)
                    }
                    
                    var_2_72C = and:int(var_2_72C:int, ldc:int(-601652277))
                }
            }
        }
    }
    
    public synchronized int write(java.nio.ByteBuffer p0) {
        var_2_11B : int
        var_4_6F : int
        var_5_128 : SSLEngineResult
        
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
        var_2_11B = and:int(and:int(ldc:int(301169959), ldc:int(904740374)), ldc:int(-623641402))
        var_4_6F = and:int(ldc:int(12450), ldc:int(-12451))
        
        loop {
            if (cmpeq:boolean(and:int(var_2_11B:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0229)
            }
            
            if (cmpeq:boolean(and:int(var_2_11B:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0193)
            }
            
            if (cmpne:boolean(and:int(var_2_11B:int, ldc:int(1024)), ldc:int(0))) {
                var_2_11B = and:int(var_2_11B:int, ldc:int(-188236362))
                
                if (logicalnot:boolean(invokevirtual:boolean(Buffer::hasRemaining, p0:ByteBuffer[expected:Buffer]))) {
                    return:int(var_4_6F:int)
                }
            }
            
            Label_0147:
            
            if (cmpeq:boolean(and:int(var_2_11B:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0229)
            }
            
            if (cmpne:boolean(and:int(var_2_11B:int, ldc:int(128)), ldc:int(0))) {
                var_2_11B = and:int(var_2_11B:int, ldc:int(1934474342))
            }
            else {
                if (cmpne:boolean(and:int(var_2_11B:int, ldc:int(33554432)), ldc:int(0))) {
                    var_2_11B = and:int(var_2_11B:int, ldc:int(125809101))
                    loopcontinue()
                }
                
                var_2_11B = and:int(var_2_11B:int, ldc:int(-538985057))
            }
            
            Label_0193:
            
            if (cmpne:boolean(and:int(var_2_11B:int, ldc:int(8388608)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_2_11B:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0147)
                }
                
                if (cmpeq:boolean(and:int(var_2_11B:int, ldc:int(4096)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_11B = and:int(var_2_11B:int, ldc:int(-219824161))
                invokevirtual:Buffer(Buffer::clear, getfield:ByteBuffer[expected:Buffer](\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\ubefe\u4ab3\ubcb0\u34df\u6198\u983f, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))
            }
            
            Label_0229:
            
            if (cmpeq:boolean(and:int(var_2_11B:int, ldc:int(4)), ldc:int(0))) {
                var_2_11B = and:int(var_2_11B:int, ldc:int(-737127432))
                goto(Label_0193)
            }
            
            if (cmpeq:boolean(and:int(var_2_11B:int, ldc:int(4194304)), ldc:int(0))) {
                var_2_11B = and:int(var_2_11B:int, ldc:int(1809902291))
                goto(Label_0147)
            }
            
            if (cmpne:boolean(and:int(var_2_11B:int, ldc:int(32768)), ldc:int(0))) {
                var_2_11B = and:int(var_2_11B:int, ldc:int(-285316844))
            }
            else {
                var_2_11B = and:int(var_2_11B:int, ldc:int(-1276903970))
                var_5_128 = invokevirtual:SSLEngineResult(SSLEngine::wrap, getfield:SSLEngine(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3d4b\u392e\ud12e\u71ae\u8709\u6198, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18), p0:ByteBuffer, getfield:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\ubefe\u4ab3\ubcb0\u34df\u6198\u983f, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))
                
                loop {
                    if (cmpeq:boolean(and:int(var_2_11B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_11B:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0478)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_11B:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0435)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_11B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_2_11B = and:int(var_2_11B:int, ldc:int(-674399009))
                        
                        switch (loadelement:int(getstatic:int[](\uf9c5\u4d85\u3e2a\ub6ab\u416d\ub1b9::\u392e\ud4fe\uc238\u071d\u839e\ub8be), invokevirtual:int(Enum<E>::ordinal, invokevirtual:Status(SSLEngineResult::getStatus, var_5_128:SSLEngineResult)))) {
                            case 1:
                                invokevirtual:Buffer(Buffer::flip, getfield:ByteBuffer[expected:Buffer](\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\ubefe\u4ab3\ubcb0\u34df\u6198\u983f, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))
                                looporswitchbreak()
                            
                            case 3:
                                putfield:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\ubefe\u4ab3\ubcb0\u34df\u6198\u983f, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18, invokespecial:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\uc7fe\u9af2\ub8be\u5654\u7ce1\u965f, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18, getfield:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\ubefe\u4ab3\ubcb0\u34df\u6198\u983f, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18)))
                                goto(Label_0557)
                            
                            case 2:
                                athrow(initobject:SSLException(SSLException::<init>, loadelement:String(getstatic:String[](\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u8aa5\u34df\ub32d\ud36e\u8d98\u8350), and:int(ldc:int(138), ldc:int(1590)))))
                            
                            case 4:
                                invokespecial:void(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\ufcaf\u8cae\u8640\uc84e\u8aa5\ucb79, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18)
                                return:int(and:int(ldc:int(-22386), ldc:int(17521)))
                            
                            default:
                                athrow(initobject:IllegalStateException(IllegalStateException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u8aa5\u34df\ub32d\ud36e\u8d98\u8350), and:int(ldc:int(4529), ldc:int(2563)))), invokevirtual:Status(SSLEngineResult::getStatus, var_5_128:SSLEngineResult)))))
                        }
                    }
                    
                    Label_0388:
                    
                    if (cmpeq:boolean(and:int(var_2_11B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_11B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0478)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_11B:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_2_11B:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_2_11B = and:int(var_2_11B:int, ldc:int(-1862763425))
                        
                        if (logicalnot:boolean(invokevirtual:boolean(Buffer::hasRemaining, getfield:ByteBuffer[expected:Buffer](\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\ubefe\u4ab3\ubcb0\u34df\u6198\u983f, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18)))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0435:
                    
                    if (cmpeq:boolean(and:int(var_2_11B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_11B:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_2_11B:int, ldc:int(8192)), ldc:int(0))) {
                            var_2_11B = and:int(var_2_11B:int, ldc:int(-759910280))
                            goto(Label_0388)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_11B:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_2_11B = and:int(var_2_11B:int, ldc:int(400735750))
                    }
                    
                    Label_0478:
                    
                    if (cmpne:boolean(and:int(var_2_11B:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_2_11B:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0435)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_11B:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0388)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_11B:int, ldc:int(32768)), ldc:int(0))) {
                            var_2_11B = and:int(var_2_11B:int, ldc:int(-457217334))
                            loopcontinue()
                        }
                        
                        var_2_11B = and:int(var_2_11B:int, ldc:int(-69960609))
                        var_4_6F = add:int(var_4_6F:int, invokevirtual:int(SocketChannel::write, getfield:SocketChannel(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u156b\u7af6\u8d90\u9255\u983f\u69d9, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18), getfield:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\ubefe\u4ab3\ubcb0\u34df\u6198\u983f, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18)))
                        goto(Label_0388)
                    }
                    
                    Label_0557:
                    
                    if (cmpeq:boolean(and:int(var_2_11B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_2_11B = and:int(var_2_11B:int, ldc:int(-1083126396))
                        goto(Label_0478)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_11B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0435)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_11B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_2_11B = and:int(var_2_11B:int, ldc:int(-15559427))
                        goto(Label_0388)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_11B:int, ldc:int(2)), ldc:int(0))) {
                        var_2_11B = and:int(var_2_11B:int, ldc:int(2028092942))
                        looporswitchbreak()
                    }
                    
                    var_2_11B = and:int(var_2_11B:int, ldc:int(-1374398186))
                }
            }
        }
    }
    
    private boolean \u2dcc\ua562\ubb2b\u3c25\u9033\u5bc4() {
        var_1_67 : int
        var_3_74 : int
        var_1_1BA : int
        var_4_1C2 : HandshakeStatus
        var_1_26CD : int
        var_5_1D1 : int
        stack_56D_0 : int [generated]
        var_6_26BC : Runnable
        var_7_11A1 : SSLEngineResult
        
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
        var_1_67 = and:int(and:int(ldc:int(322249420), ldc:int(669350130)), ldc:int(-1279394369))
        var_3_74 = invokeinterface:int(SSLSession::getApplicationBufferSize, invokevirtual:SSLSession(SSLEngine::getSession, getfield:SSLEngine(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3d4b\u392e\ud12e\u71ae\u8709\u6198, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18)))
        
        loop {
            if (cmpne:boolean(and:int(var_1_67:int, ldc:int(256)), ldc:int(0))) {
                var_1_67 = and:int(var_1_67:int, ldc:int(-1991024736))
                goto(Label_0388)
            }
            
            if (cmpne:boolean(and:int(var_1_67:int, ldc:int(1024)), ldc:int(0))) {
                var_1_67 = and:int(var_1_67:int, ldc:int(1844135111))
                goto(Label_0327)
            }
            
            if (cmpne:boolean(and:int(var_1_67:int, ldc:int(131072)), ldc:int(0))) {
                var_1_67 = and:int(var_1_67:int, ldc:int(2015207879))
                goto(Label_0257)
            }
            
            if (cmpne:boolean(and:int(var_1_67:int, ldc:int(1024)), ldc:int(0))) {
                var_1_67 = and:int(var_1_67:int, ldc:int(-210511945))
            }
            else {
                var_1_67 = and:int(var_1_67:int, ldc:int(335379685))
                putfield:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\ucef1\u965f\u392e\u385b\u67e9\u8753, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18, invokestatic:ByteBuffer(ByteBuffer::allocate, var_3_74:int))
            }
            
            Label_0196:
            
            if (cmpne:boolean(and:int(var_1_67:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_0388)
            }
            
            if (cmpne:boolean(and:int(var_1_67:int, ldc:int(131072)), ldc:int(0))) {
                var_1_67 = and:int(var_1_67:int, ldc:int(145022936))
                goto(Label_0327)
            }
            
            if (cmpne:boolean(and:int(var_1_67:int, ldc:int(33554432)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_1_67:int, ldc:int(1024)), ldc:int(0))) {
                    var_1_67 = and:int(var_1_67:int, ldc:int(211064341))
                    loopcontinue()
                }
                
                var_1_67 = and:int(var_1_67:int, ldc:int(-268458307))
                putfield:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3dd3\u071d\u62da\ub113\ubf56\u69d9, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18, invokestatic:ByteBuffer(ByteBuffer::allocate, var_3_74:int))
            }
            
            Label_0257:
            
            if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(128)), ldc:int(0))) {
                var_1_67 = and:int(var_1_67:int, ldc:int(-1198459948))
                goto(Label_0388)
            }
            
            if (cmpne:boolean(and:int(var_1_67:int, ldc:int(4194304)), ldc:int(0))) {
                var_1_67 = and:int(var_1_67:int, ldc:int(-1683507828))
            }
            else {
                if (cmpne:boolean(and:int(var_1_67:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0196)
                }
                
                if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(8192)), ldc:int(0))) {
                    var_1_67 = and:int(var_1_67:int, ldc:int(703468446))
                    loopcontinue()
                }
                
                var_1_67 = and:int(var_1_67:int, ldc:int(-616618332))
                invokevirtual:Buffer(Buffer::clear, getfield:ByteBuffer[expected:Buffer](\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\ubefe\u4ab3\ubcb0\u34df\u6198\u983f, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))
            }
            
            Label_0327:
            
            if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(65536)), ldc:int(0))) {
                var_1_67 = and:int(var_1_67:int, ldc:int(1226018810))
            }
            else {
                if (cmpne:boolean(and:int(var_1_67:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_0257)
                }
                
                if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0196)
                }
                
                if (cmpne:boolean(and:int(var_1_67:int, ldc:int(4194304)), ldc:int(0))) {
                    var_1_67 = and:int(var_1_67:int, ldc:int(1356364537))
                    loopcontinue()
                }
                
                var_1_67 = and:int(var_1_67:int, ldc:int(1408623823))
                invokevirtual:Buffer(Buffer::clear, getfield:ByteBuffer[expected:Buffer](\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\uc2bd\u0c95\u64ab\u5bc4\u72f1\u624e, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))
            }
            
            Label_0388:
            
            if (cmpne:boolean(and:int(var_1_67:int, ldc:int(1024)), ldc:int(0))) {
                var_1_67 = and:int(var_1_67:int, ldc:int(1312616835))
                goto(Label_0327)
            }
            
            if (cmpne:boolean(and:int(var_1_67:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0257)
            }
            
            if (cmpne:boolean(and:int(var_1_67:int, ldc:int(32768)), ldc:int(0))) {
                var_1_67 = and:int(var_1_67:int, ldc:int(938614542))
                goto(Label_0196)
            }
            
            if (cmpne:boolean(and:int(var_1_67:int, ldc:int(2097152)), ldc:int(0))) {
                looporswitchbreak()
            }
        }
        
        var_1_1BA = and:int(var_1_67:int, ldc:int(-680563309))
        var_4_1C2 = invokevirtual:HandshakeStatus(SSLEngine::getHandshakeStatus, getfield:SSLEngine(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3d4b\u392e\ud12e\u71ae\u8709\u6198, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))
        var_1_26CD = and:int(var_1_1BA:int, ldc:int(-231246679))
        var_5_1D1 = and:int(ldc:int(-883), ldc:int(880))
        
        loop {
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_7004)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_4295)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_4045)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_3828)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_3620)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_3376)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_3150)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_2916)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(536870912)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(57150005))
                goto(Label_2699)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(536870912)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1886332287))
                goto(Label_2498)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_2287)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_2058)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_1815)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(8192)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-2127357265))
                goto(Label_1611)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(360006938))
                goto(Label_1391)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_1118)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0858)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(256)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-949145210))
                
                if (cmpne:boolean(var_5_1D1:int, ldc:int(0))) {
                    return:boolean(and:int[expected:boolean](ldc:int(519), ldc:int(25985)))
                }
            }
            
            Label_0643:
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1625040312))
                goto(Label_7004)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_4295)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1679634282))
                goto(Label_4045)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_3828)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_3620)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_3376)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-336191258))
                goto(Label_3150)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(767340009))
                goto(Label_2916)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(8192)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(2115512273))
                goto(Label_2699)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_2498)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2147483647)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(316522336))
                goto(Label_2287)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_2058)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_1815)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_1611)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_1391)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(8192)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-345610153))
                goto(Label_1118)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1190560678))
            }
            else {
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-509425981))
                    loopcontinue()
                }
                
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1806545807))
            }
            
            Label_0858:
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_7004)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_4295)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_4045)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(32768)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(327068715))
                goto(Label_3828)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_3620)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_3376)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_3150)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1781942978))
                goto(Label_2916)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1358043440))
                goto(Label_2699)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(909416161))
                goto(Label_2498)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_2287)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2147483647)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1787822962))
                goto(Label_2058)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_1815)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_1611)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(284820806))
                goto(Label_1391)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1456299013))
            }
            else {
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_0643)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(536870912)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-92800370))
                
                switch (loadelement:int(getstatic:int[](\uf9c5\u4d85\u3e2a\ub6ab\u416d\ub1b9::\u51b2\ub113\uc31c\u8d98\u516c\uae87), invokevirtual:int(Enum<E>::ordinal, var_4_1C2:HandshakeStatus[expected:Enum<HandshakeStatus>]))) {
                    case 1:
                        if (logicalnot:boolean(invokevirtual:boolean(Buffer::hasRemaining, getfield:ByteBuffer[expected:Buffer](\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\uc2bd\u0c95\u64ab\u5bc4\u72f1\u624e, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18)))) {
                            looporswitchbreak()
                        }
                        
                        stack_56D_0 = and:int(ldc:int(11889), ldc:int(-11892))
                        goto(Label_1383)
                    
                    case 2:
                        if (cmplt:boolean(invokevirtual:int(SocketChannel::read, getfield:SocketChannel(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u156b\u7af6\u8d90\u9255\u983f\u69d9, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18), getfield:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\uc2bd\u0c95\u64ab\u5bc4\u72f1\u624e, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18)), ldc:int(0))) {
                            goto(Label_2287)
                        }
                        
                        invokevirtual:Buffer(Buffer::flip, getfield:ByteBuffer[expected:Buffer](\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\uc2bd\u0c95\u64ab\u5bc4\u72f1\u624e, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))
                        goto(Block_312)
                    
                    case 3:
                        invokevirtual:Buffer(Buffer::clear, getfield:ByteBuffer[expected:Buffer](\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\ubefe\u4ab3\ubcb0\u34df\u6198\u983f, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))
                        goto(Block_436)
                    
                    case 4:
                        while (cmpne:boolean(var_6_26BC = invokevirtual:Runnable(SSLEngine::getDelegatedTask, getfield:SSLEngine(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3d4b\u392e\ud12e\u71ae\u8709\u6198, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18)), aconstnull:Runnable())) {
                            do {
                                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1703990869))
                                }
                            } while (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(32768)), ldc:int(0)))
                            
                            var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1904891658))
                            invokeinterface:void(Executor::execute, getfield:ExecutorService[expected:Executor](\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u156b\u7c6b\u3e75\ubff1\ubb2b\u4492, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18), var_6_26BC:Runnable)
                        }
                        
                        var_4_1C2 = invokevirtual:HandshakeStatus(SSLEngine::getHandshakeStatus, getfield:SSLEngine(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3d4b\u392e\ud12e\u71ae\u8709\u6198, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(-352883041))
                        loopcontinue()
                    
                    case 5:
                        loopcontinue()
                    
                    default:
                        athrow(initobject:IllegalStateException(IllegalStateException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u8aa5\u34df\ub32d\ud36e\u8d98\u8350), and:int(ldc:int(7), ldc:int(17057)))), var_4_1C2:HandshakeStatus[expected:Object]))))
                }
            }
            
            Label_1118:
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_7004)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_4295)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(8192)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1330463058))
                goto(Label_4045)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1214806253))
                goto(Label_3828)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(859835589))
                goto(Label_3620)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-232890088))
                goto(Label_3376)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_3150)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-570920096))
                goto(Label_2916)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_2699)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-973835888))
                goto(Label_2498)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_2287)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1698951881))
                goto(Label_2058)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1843606057))
                goto(Label_1815)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_1611)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(624096477))
                goto(Label_1391)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1973469024))
                goto(Label_0858)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-597823070))
                goto(Label_0643)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-816662718))
                loopcontinue()
            }
            
            var_1_26CD = and:int(var_1_26CD:int, ldc:int(179120617))
            stack_56D_0 = and:int(ldc:int(9313), ldc:int(20481))
            Label_1383:
            var_1_26CD = and:int(var_1_26CD:int, ldc:int(-2013973039))
            var_5_1D1 = stack_56D_0:int
            Label_1391:
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_7004)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1644127677))
                goto(Label_4295)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(700664522))
                goto(Label_4045)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_3828)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1432214597))
                goto(Label_3620)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1570034274))
                goto(Label_3376)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_3150)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-768210437))
                goto(Label_2916)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_2699)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1477862436))
                goto(Label_2498)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_2287)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1511822851))
                goto(Label_2058)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_1815)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_1118)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_0858)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(1316705698))
                    goto(Label_0643)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1903587247))
                    loopcontinue()
                }
                
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1786717355))
                
                if (cmpeq:boolean(var_5_1D1:int, ldc:int(0))) {
                    invokevirtual:int(SocketChannel::write, getfield:SocketChannel(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u156b\u7af6\u8d90\u9255\u983f\u69d9, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18), getfield:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\uc2bd\u0c95\u64ab\u5bc4\u72f1\u624e, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))
                    goto(Label_2058)
                }
            }
            
            Label_1611:
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(256)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-930224855))
                goto(Label_7004)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(128)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(824462437))
                goto(Label_4295)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_4045)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_3828)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_3620)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_3376)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-853475935))
                goto(Label_3150)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_2916)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1737557947))
                goto(Label_2699)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-589627477))
                goto(Label_2498)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_2287)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(662778442))
                goto(Label_2058)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(485455841))
            }
            else {
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_1391)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_1118)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_0858)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_0643)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(184377760))
            }
            
            Label_1815:
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1380940313))
                goto(Label_7004)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1635451749))
                goto(Label_4295)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_4045)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_3828)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_3620)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1105231640))
                goto(Label_3376)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_3150)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(2035616792))
                goto(Label_2916)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(841707100))
                goto(Label_2699)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_2498)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1939315541))
                goto(Label_2287)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_1611)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_1391)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_1118)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(536870912)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-618114727))
                    goto(Label_0858)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1771275016))
                    goto(Label_0643)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(190290274))
                    loopcontinue()
                }
                
                return:boolean(xor:int[expected:boolean](ldc:int(1025), ldc:int(1024)))
            }
            
            Label_2058:
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_7004)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_4295)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_4045)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(536870912)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1976993511))
                goto(Label_3828)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_3620)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1982942796))
                goto(Label_3376)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_3150)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_2916)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-964562049))
                goto(Label_2699)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_2498)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1064382575))
            }
            else {
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_1815)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(1152147813))
                    goto(Label_1611)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_1391)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(8192)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-694991377))
                    goto(Label_1118)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0858)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-2045218026))
                    goto(Label_0643)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(256)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(1130130453))
                    loopcontinue()
                }
                
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(192274643))
                loopcontinue()
            }
            
            Label_2287:
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_7004)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(256)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1241799874))
                goto(Label_4295)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_4045)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_3828)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_3620)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1554791044))
                goto(Label_3376)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-780253894))
                goto(Label_3150)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_2916)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_2699)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_2058)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-924555812))
                    goto(Label_1815)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_1611)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(1133725887))
                    goto(Label_1391)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1485483293))
                    goto(Label_1118)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(1217430127))
                    goto(Label_0858)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(32768)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(1551206568))
                    goto(Label_0643)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-496028996))
            }
            
            Label_2498:
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(8192)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(377412426))
                goto(Label_7004)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_4295)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_4045)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1593189108))
                goto(Label_3828)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_3620)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_3376)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_3150)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(922559115))
                goto(Label_2916)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_2287)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_2058)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(997170864))
                    goto(Label_1815)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_1611)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(241326219))
                    goto(Label_1391)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_1118)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0858)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_0643)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(678105231))
                    loopcontinue()
                }
                
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(738015141))
                
                if (logicalnot:boolean(invokevirtual:boolean(SSLEngine::isInboundDone, getfield:SSLEngine(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3d4b\u392e\ud12e\u71ae\u8709\u6198, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18)))) {
                    goto(Label_3369)
                }
            }
            
            Label_2699:
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(8192)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(621078464))
                goto(Label_7004)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_4295)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1319268264))
                goto(Label_4045)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(8192)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(96858174))
                goto(Label_3828)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-29356548))
                goto(Label_3620)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_3376)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_3150)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(589383937))
            }
            else {
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_2498)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-541432238))
                    goto(Label_2287)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_2058)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(1731490885))
                    goto(Label_1815)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_1611)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_1391)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_1118)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_0858)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-47171249))
                    goto(Label_0643)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2147483647)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1707267167))
                
                if (logicalnot:boolean(invokevirtual:boolean(SSLEngine::isOutboundDone, getfield:SSLEngine(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3d4b\u392e\ud12e\u71ae\u8709\u6198, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18)))) {
                    goto(Label_3369)
                }
            }
            
            Label_2916:
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_7004)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-23513023))
                goto(Label_4295)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-555926354))
                goto(Label_4045)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_3828)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(32768)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(196787668))
                goto(Label_3620)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(32768)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1283681101))
                goto(Label_3376)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(334342670))
                    goto(Label_2699)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_2498)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_2287)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(32768)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1264597560))
                    goto(Label_2058)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-780221553))
                    goto(Label_1815)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(461283665))
                    goto(Label_1611)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_1391)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(8192)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(222394683))
                    goto(Label_1118)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(32768)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1843317919))
                    goto(Label_0858)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_0643)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(988111346))
            }
            
            Label_3150:
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1298570421))
                goto(Label_7004)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-60130944))
                goto(Label_4295)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_4045)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_3828)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1634633040))
                goto(Label_3620)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2147483647)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-912164795))
                goto(Label_3376)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_2916)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(32768)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1721567155))
                goto(Label_2699)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_2498)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_2287)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-869783096))
                goto(Label_2058)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_1815)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_1611)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_1391)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-118920119))
                goto(Label_1118)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0858)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2147483647)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-949551780))
                goto(Label_0643)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(21833), ldc:int(-30026)))
            }
            
            loopcontinue()
            
            try {
                Label_3369:
                invokevirtual:void(SSLEngine::closeInbound, getfield:SSLEngine(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3d4b\u392e\ud12e\u71ae\u8709\u6198, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))
                Label_3376:
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_7004)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_4295)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_4045)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(2002798981))
                    goto(Label_3828)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(8192)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1706615796))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(-711386065))
                        goto(Label_3150)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(8192)), ldc:int(0))) {
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1751715851))
                        goto(Label_2916)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_2699)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_2498)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_2287)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(-146895433))
                        goto(Label_2058)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(-705391854))
                        goto(Label_1815)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(1952182608))
                        goto(Label_1611)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(221943009))
                        goto(Label_1391)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(1631171315))
                        goto(Label_1118)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(391741523))
                        goto(Label_0858)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0643)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(-2027832274))
                        loopcontinue()
                    }
                    
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1427821108))
                }
            }
            catch (javax.net.ssl.SSLException stack_E22_0) {
            }
            
            Label_3620:
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_7004)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(128)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-210091323))
                goto(Label_4295)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_4045)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(1)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_3376)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(1138331793))
                    goto(Label_3150)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_2916)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(128)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1369430020))
                    goto(Label_2699)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(28298564))
                    goto(Label_2498)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_2287)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1291327646))
                    goto(Label_2058)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_1815)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_1611)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_1391)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(1382535728))
                    goto(Label_1118)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_0858)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1934486713))
                    goto(Label_0643)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-671223067))
                invokevirtual:void(SSLEngine::closeOutbound, getfield:SSLEngine(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3d4b\u392e\ud12e\u71ae\u8709\u6198, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))
            }
            
            Label_3828:
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(467463731))
                goto(Label_7004)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_4295)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2147483647)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(143866248))
            }
            else {
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(256)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(1985681642))
                    goto(Label_3620)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_3376)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_3150)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(1261915551))
                    goto(Label_2916)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_2699)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1011296523))
                    goto(Label_2498)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(1984080493))
                    goto(Label_2287)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_2058)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(95372625))
                    goto(Label_1815)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-270959182))
                    goto(Label_1611)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_1391)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_1118)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_0858)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_0643)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1209686860))
                var_4_1C2 = invokevirtual:HandshakeStatus(SSLEngine::getHandshakeStatus, getfield:SSLEngine(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3d4b\u392e\ud12e\u71ae\u8709\u6198, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))
            }
            
            Label_4045:
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_7004)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1339431971))
                    goto(Label_3828)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(256)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1920302257))
                    goto(Label_3620)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(204896414))
                    goto(Label_3376)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1860420887))
                    goto(Label_3150)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_2916)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_2699)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_2498)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1317530971))
                    goto(Label_2287)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-128629415))
                    goto(Label_2058)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(32768)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(1632089338))
                    goto(Label_1815)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_1611)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-2110876204))
                    goto(Label_1391)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(499556258))
                    goto(Label_1118)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_0858)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-340830101))
                    goto(Label_0643)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1661336536))
                    loopcontinue()
                }
                
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-697484645))
                loopcontinue()
            }
            
            Block_312:
            
            try {
                Label_4295:
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_7004)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_4045)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_3828)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_3620)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_3376)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(8192)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1060873754))
                    goto(Label_3150)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_2916)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(1540545076))
                    goto(Label_2699)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_2498)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_2287)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(664102627))
                    goto(Label_2058)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(1239782690))
                    goto(Label_1815)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(175355862))
                    goto(Label_1611)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_1391)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_1118)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0858)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-180214637))
                    goto(Label_0643)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-399947675))
                    loopcontinue()
                }
                
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1708131595))
                var_7_11A1 = invokevirtual:SSLEngineResult(SSLEngine::unwrap, getfield:SSLEngine(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3d4b\u392e\ud12e\u71ae\u8709\u6198, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18), getfield:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\uc2bd\u0c95\u64ab\u5bc4\u72f1\u624e, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18), getfield:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3dd3\u071d\u62da\ub113\ubf56\u69d9, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))
                Label_4515:
                
                while (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(536870912)), ldc:int(0))) {
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(-2010667984))
                        goto(Label_9355)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(461249776))
                        goto(Label_9118)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(8192)), ldc:int(0))) {
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(503930925))
                        goto(Label_8899)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(1648162618))
                        goto(Label_8633)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(256)), ldc:int(0))) {
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(-2063013936))
                        goto(Label_8356)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_8130)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(536870912)), ldc:int(0))) {
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(37532485))
                        goto(Label_7884)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(1948744134))
                        goto(Label_7406)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(-14355881))
                        goto(Label_7230)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_6708)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(1956815782))
                        goto(Label_6472)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_6221)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(1515310183))
                        goto(Label_6031)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(32768)), ldc:int(0))) {
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(1916543512))
                        goto(Label_5777)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(208332944))
                        goto(Label_5515)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(32768)), ldc:int(0))) {
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(1457950798))
                        goto(Label_5002)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(-226546204))
                        invokevirtual:ByteBuffer(ByteBuffer::compact, getfield:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\uc2bd\u0c95\u64ab\u5bc4\u72f1\u624e, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))
                    }
                    
                    Label_4787:
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_9594)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_9355)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_9118)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_8899)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_8633)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(803917825))
                        goto(Label_8356)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(32768)), ldc:int(0))) {
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(356980336))
                        goto(Label_8130)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_7884)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_7406)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(8192)), ldc:int(0))) {
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(1851138705))
                        goto(Label_7230)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(1728534063))
                        goto(Label_6708)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(272064941))
                        goto(Label_6472)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(338661545))
                        goto(Label_6221)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_6031)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(-965861556))
                        goto(Label_5777)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_5515)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(536870912)), ldc:int(0))) {
                            var_1_26CD = and:int(var_1_26CD:int, ldc:int(935359414))
                            loopcontinue()
                        }
                        
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(2074978721))
                        var_4_1C2 = invokevirtual:HandshakeStatus(SSLEngineResult::getHandshakeStatus, var_7_11A1:SSLEngineResult)
                    }
                    
                    Label_5002:
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(886892527))
                        goto(Label_9594)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(256)), ldc:int(0))) {
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1737703932))
                        goto(Label_9355)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(245206157))
                        goto(Label_9118)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_8899)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_8633)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(32768)), ldc:int(0))) {
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(-927527263))
                        goto(Label_8356)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(2138588989))
                        goto(Label_8130)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_7884)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_7406)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(1493441513))
                        goto(Label_7230)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1581759256))
                        goto(Label_6708)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_6472)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_6221)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(128)), ldc:int(0))) {
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(-318752692))
                        goto(Label_6031)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_5777)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_5515)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1026737106))
                        goto(Label_4787)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(863839428))
                        goto(Label_5449)
                    }
                    
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(391466678))
                }
                
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1721320873))
                goto(Label_9594)
            }
            catch (javax.net.ssl.SSLException stack_1471_0) {
            }
            
            goto(Label_5235)
            Label_5449:
            
            switch (loadelement:int(getstatic:int[](\uf9c5\u4d85\u3e2a\ub6ab\u416d\ub1b9::\u392e\ud4fe\uc238\u071d\u839e\ub8be), invokevirtual:int(Enum<E>::ordinal, invokevirtual:Status(SSLEngineResult::getStatus, var_7_11A1:SSLEngineResult)))) {
                case 1:
                    loopcontinue()
                
                case 3:
                    putfield:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3dd3\u071d\u62da\ub113\ubf56\u69d9, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18, invokespecial:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\ua6bd\ud7e8\u839e\u4975\uf995\u12b2, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18, getfield:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3dd3\u071d\u62da\ub113\ubf56\u69d9, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18)))
                    goto(Label_5515)
                
                case 2:
                    putfield:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\uc2bd\u0c95\u64ab\u5bc4\u72f1\u624e, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18, invokespecial:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\ud7e8\u59ec\u8640\u6198\ube23\u7330, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18, getfield:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\uc2bd\u0c95\u64ab\u5bc4\u72f1\u624e, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18)))
                    goto(Label_5777)
                
                case 4:
                    if (invokevirtual:boolean(SSLEngine::isOutboundDone, getfield:SSLEngine(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3d4b\u392e\ud12e\u71ae\u8709\u6198, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))) {
                        goto(Label_6031)
                    }
                    
                    invokevirtual:void(SSLEngine::closeOutbound, getfield:SSLEngine(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3d4b\u392e\ud12e\u71ae\u8709\u6198, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))
                    goto(Label_6472)
                
                default:
                    athrow(initobject:IllegalStateException(IllegalStateException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u8aa5\u34df\ub32d\ud36e\u8d98\u8350), and:int(ldc:int(8433), ldc:int(4097)))), invokevirtual:Status(SSLEngineResult::getStatus, var_7_11A1:SSLEngineResult)))))
            }
            
            Label_5235:
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2147483647)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1625429451))
                goto(Label_7743)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_7684)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(960663308))
                goto(Label_7624)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-596514506))
                goto(Label_5372)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(32768)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-407557897))
                invokevirtual:void(SSLEngine::closeOutbound, getfield:SSLEngine(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3d4b\u392e\ud12e\u71ae\u8709\u6198, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))
            }
            
            Label_5312:
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-794440963))
                goto(Label_7743)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_7684)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_7624)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_5235)
                }
                
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-605045864))
                var_4_1C2 = invokevirtual:HandshakeStatus(SSLEngine::getHandshakeStatus, getfield:SSLEngine(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3d4b\u392e\ud12e\u71ae\u8709\u6198, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))
            }
            
            Label_5372:
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(256)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-143685740))
                goto(Label_7743)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(32768)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1939129652))
                goto(Label_7684)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_7624)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-2002187952))
                goto(Label_5312)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1932361093))
                loopcontinue()
            }
            
            goto(Label_5235)
            Label_5515:
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(46421412))
                goto(Label_9594)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(256)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-609903520))
                goto(Label_9355)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(733318614))
                goto(Label_9118)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_8899)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_8633)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(249007244))
                goto(Label_8356)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-699385097))
                goto(Label_8130)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_7884)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_7406)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-491090460))
                goto(Label_7230)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1737435706))
                goto(Label_6708)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_6472)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1039903139))
                goto(Label_6221)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(612634758))
                goto(Label_6031)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(536870912)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-397736737))
            }
            else {
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(1920420890))
                    goto(Label_5002)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_4787)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(1164620425))
                    goto(Label_4515)
                }
                
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-747263855))
                loopcontinue()
            }
            
            Label_5777:
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_9594)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(256)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1031507621))
                goto(Label_9355)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_9118)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1617344727))
                goto(Label_8899)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1792630589))
                goto(Label_8633)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1727043734))
                goto(Label_8356)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_8130)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1270562538))
                goto(Label_7884)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_7406)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(256)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-2062574926))
                goto(Label_7230)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1618196260))
                goto(Label_6708)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1724855385))
                goto(Label_6472)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(8192)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-2050995205))
                goto(Label_6221)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1719671435))
            }
            else {
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_5515)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_5002)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-734137951))
                    goto(Label_4787)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-289463602))
                    loopcontinue()
                }
                
                goto(Label_4515)
            }
            
            Label_6031:
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_9594)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_9355)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(457157124))
                goto(Label_9118)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-61557833))
                goto(Label_8899)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_8633)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_8356)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_8130)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_7884)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1771084880))
                goto(Label_7406)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_7230)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_6708)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_6472)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_5777)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(343314744))
                    goto(Label_5515)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(79871570))
                    goto(Label_5002)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_4787)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(428141468))
                    goto(Label_4515)
                }
                
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1704642618))
            }
            
            Label_6221:
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_9594)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(32768)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1320086584))
                goto(Label_9355)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-264553738))
                goto(Label_9118)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_8899)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_8633)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1636438928))
                goto(Label_8356)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_8130)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(128)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1667351207))
                goto(Label_7884)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(128)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1778937792))
                goto(Label_7406)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_7230)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(8192)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(331328235))
                goto(Label_6708)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(1655417512))
                    goto(Label_6031)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(1043325307))
                    goto(Label_5777)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_5515)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-899284706))
                    goto(Label_5002)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_4787)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1376029561))
                    goto(Label_4515)
                }
                
                return:boolean(and:int[expected:boolean](ldc:int(-10152), ldc:int(10150)))
            }
            
            Label_6472:
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(32768)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(413276116))
                goto(Label_9594)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-595320115))
                goto(Label_9355)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1752796720))
                goto(Label_9118)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_8899)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(8192)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(858180402))
                goto(Label_8633)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_8356)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1027972449))
                goto(Label_8130)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_7884)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_7406)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_7230)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1859468784))
            }
            else {
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_6221)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_6031)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(2071044182))
                    goto(Label_5777)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(1769605112))
                    goto(Label_5515)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(1927054563))
                    goto(Label_5002)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1989858407))
                    goto(Label_4787)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_4515)
                }
                
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(456112894))
                var_4_1C2 = invokevirtual:HandshakeStatus(SSLEngine::getHandshakeStatus, getfield:SSLEngine(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3d4b\u392e\ud12e\u71ae\u8709\u6198, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))
            }
            
            Label_6708:
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_9594)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-370270646))
                goto(Label_9355)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_9118)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1245810576))
                goto(Label_8899)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(889545912))
                goto(Label_8633)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_8356)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(536870912)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-722164704))
                goto(Label_8130)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1026530196))
                goto(Label_7884)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-584511913))
                goto(Label_7406)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(128)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1197303215))
                goto(Label_7230)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_6472)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(10185487))
                goto(Label_6221)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_6031)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_5777)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_5515)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-2017747872))
                goto(Label_5002)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1341516159))
                goto(Label_4787)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1657324403))
                goto(Label_4515)
            }
            
            var_1_26CD = and:int(var_1_26CD:int, ldc:int(1182105264))
            loopcontinue()
            Block_436:
            
            try {
                Label_7004:
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1765326955))
                    goto(Label_4295)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_4045)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1826177060))
                    goto(Label_3828)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1062706944))
                    goto(Label_3620)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(536870912)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1679163771))
                    goto(Label_3376)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(1210221362))
                    goto(Label_3150)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_2916)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-658825928))
                    goto(Label_2699)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_2498)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_2287)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_2058)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_1815)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_1611)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(475728045))
                    goto(Label_1391)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(1836840372))
                    goto(Label_1118)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_0858)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0643)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(256)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1446493411))
                var_7_11A1 = invokevirtual:SSLEngineResult(SSLEngine::wrap, getfield:SSLEngine(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3d4b\u392e\ud12e\u71ae\u8709\u6198, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18), getfield:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\ucef1\u965f\u392e\u385b\u67e9\u8753, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18), getfield:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\ubefe\u4ab3\ubcb0\u34df\u6198\u983f, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))
                Label_7230:
                
                while (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_9355)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_9118)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_8899)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_8633)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Block_642)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_8130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_7884)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_6708)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_6472)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_6221)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(128)), ldc:int(0))) {
                            goto(Block_649)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Block_650)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_5515)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_5002)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_4787)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_4515)
                        }
                        
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(801056641))
                        var_4_1C2 = invokevirtual:HandshakeStatus(SSLEngineResult::getHandshakeStatus, var_7_11A1:SSLEngineResult)
                    }
                    
                    Label_7406:
                    
                    if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Block_655)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_9355)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_9118)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_8899)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Block_659)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_8356)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_8130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_7884)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_7500)
                    }
                    
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(1350851197))
                }
                
                goto(Label_9594)
                Block_642:
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(860623855))
                goto(Label_8356)
                Block_649:
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-811944193))
                goto(Label_6031)
                Block_650:
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-380397950))
                goto(Label_5777)
                Block_655:
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(448567167))
                goto(Label_9594)
                Block_659:
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-491512573))
                goto(Label_8633)
                Label_7500:
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(256)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1016205267))
                    goto(Label_6708)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(1108134904))
                    goto(Label_6472)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(1570441005))
                    goto(Label_6221)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_6031)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1693606894))
                    goto(Label_5777)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_5515)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(258084541))
                    goto(Label_5002)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_4787)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(1005005049))
                    goto(Label_7829)
                }
                
                goto(Label_4515)
            }
            catch (javax.net.ssl.SSLException stack_1DC6_0) {
            }
            
            goto(Label_7624)
            Label_7829:
            
            switch (loadelement:int(getstatic:int[](\uf9c5\u4d85\u3e2a\ub6ab\u416d\ub1b9::\u392e\ud4fe\uc238\u071d\u839e\ub8be), invokevirtual:int(Enum<E>::ordinal, invokevirtual:Status(SSLEngineResult::getStatus, var_7_11A1:SSLEngineResult)))) {
                case 1:
                    invokevirtual:Buffer(Buffer::flip, getfield:ByteBuffer[expected:Buffer](\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\ubefe\u4ab3\ubcb0\u34df\u6198\u983f, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))
                    goto(Label_7884)
                
                case 3:
                    putfield:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\ubefe\u4ab3\ubcb0\u34df\u6198\u983f, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18, invokespecial:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\uc7fe\u9af2\ub8be\u5654\u7ce1\u965f, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18, getfield:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\ubefe\u4ab3\ubcb0\u34df\u6198\u983f, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18)))
                    goto(Label_8633)
                
                case 2:
                    athrow(initobject:SSLException(SSLException::<init>, loadelement:String(getstatic:String[](\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u8aa5\u34df\ub32d\ud36e\u8d98\u8350), xor:int(ldc:int(2560), ldc:int(2562)))))
                
                case 4:
                    try {
                        invokevirtual:Buffer(Buffer::flip, getfield:ByteBuffer[expected:Buffer](\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\ubefe\u4ab3\ubcb0\u34df\u6198\u983f, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))
                        
                        loop {
                            Label_8899:
                            
                            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(128)), ldc:int(0))) {
                                var_1_26CD = and:int(var_1_26CD:int, ldc:int(981533063))
                                goto(Label_9594)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                                goto(Label_9355)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1443592704))
                                    goto(Label_8633)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(536870912)), ldc:int(0))) {
                                    goto(Label_8356)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-169397274))
                                    goto(Label_8130)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                                    goto(Label_7884)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(8192)), ldc:int(0))) {
                                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-995673433))
                                    goto(Label_7406)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(128)), ldc:int(0))) {
                                    goto(Label_7230)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                                    goto(Label_6708)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                                    goto(Label_6472)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(1728329435))
                                    goto(Label_6221)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(32768)), ldc:int(0))) {
                                    goto(Label_6031)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(256)), ldc:int(0))) {
                                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1857153239))
                                    goto(Label_5777)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                                    goto(Label_5515)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(32768)), ldc:int(0))) {
                                    goto(Label_5002)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(536870912)), ldc:int(0))) {
                                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(244075967))
                                    goto(Label_4787)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1651834364))
                                    goto(Label_4515)
                                }
                                
                                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1775764297))
                                
                                if (logicalnot:boolean(invokevirtual:boolean(Buffer::hasRemaining, getfield:ByteBuffer[expected:Buffer](\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\ubefe\u4ab3\ubcb0\u34df\u6198\u983f, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18)))) {
                                    invokevirtual:Buffer(Buffer::clear, getfield:ByteBuffer[expected:Buffer](\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\uc2bd\u0c95\u64ab\u5bc4\u72f1\u624e, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))
                                    goto(Label_9594)
                                }
                            }
                            
                            Label_9118:
                            
                            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                                goto(Label_9594)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                                var_1_26CD = and:int(var_1_26CD:int, ldc:int(477663301))
                            }
                            else {
                                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(536870912)), ldc:int(0))) {
                                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(184655716))
                                    loopcontinue()
                                }
                                
                                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1940865769))
                                    goto(Label_8633)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                                    goto(Label_8356)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2147483647)), ldc:int(0))) {
                                    goto(Label_8130)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                                    goto(Label_7884)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(1859345855))
                                    goto(Label_7406)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1)), ldc:int(0))) {
                                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-448265261))
                                    goto(Label_7230)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1306869268))
                                    goto(Label_6708)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1644629404))
                                    goto(Label_6472)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(128894068))
                                    goto(Label_6221)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(536870912)), ldc:int(0))) {
                                    goto(Label_6031)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                                    goto(Label_5777)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1934193741))
                                    goto(Label_5515)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                                    goto(Label_5002)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(8192)), ldc:int(0))) {
                                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(2090867974))
                                    goto(Label_4787)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(1110683907))
                                    goto(Label_4515)
                                }
                                
                                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1351667457))
                            }
                            
                            Label_9355:
                            
                            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1709390016))
                            }
                            else {
                                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(32768)), ldc:int(0))) {
                                    goto(Label_9118)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                                    goto(Label_8633)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                                    goto(Label_8356)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1)), ldc:int(0))) {
                                    goto(Label_8130)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                                    goto(Label_7884)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1)), ldc:int(0))) {
                                    goto(Label_7406)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1696230953))
                                    goto(Label_7230)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(1774279196))
                                    goto(Label_6708)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(128)), ldc:int(0))) {
                                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(1109858056))
                                    goto(Label_6472)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                                    goto(Label_6221)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1593474602))
                                    goto(Label_6031)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2147483647)), ldc:int(0))) {
                                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1968875365))
                                    goto(Label_5777)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(256)), ldc:int(0))) {
                                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1809245332))
                                    goto(Label_5515)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                                    goto(Label_5002)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(32768)), ldc:int(0))) {
                                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(501800026))
                                    goto(Label_4787)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(593831382))
                                    invokevirtual:int(SocketChannel::write, getfield:SocketChannel(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u156b\u7af6\u8d90\u9255\u983f\u69d9, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18), getfield:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\ubefe\u4ab3\ubcb0\u34df\u6198\u983f, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))
                                    loopcontinue()
                                }
                                
                                goto(Label_4515)
                            }
                            
                            Label_9594:
                            
                            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(536870912)), ldc:int(0))) {
                                goto(Label_9355)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                                var_1_26CD = and:int(var_1_26CD:int, ldc:int(894074274))
                                goto(Label_9118)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(32768)), ldc:int(0))) {
                                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1500175450))
                                goto(Label_8633)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                                goto(Label_8356)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1)), ldc:int(0))) {
                                var_1_26CD = and:int(var_1_26CD:int, ldc:int(66316998))
                                goto(Label_8130)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                                goto(Label_7884)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(536870912)), ldc:int(0))) {
                                goto(Label_7406)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1)), ldc:int(0))) {
                                goto(Label_7230)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(256)), ldc:int(0))) {
                                goto(Label_6708)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2147483647)), ldc:int(0))) {
                                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1405416979))
                                goto(Label_6472)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                                goto(Label_6221)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-655837718))
                                goto(Label_6031)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1)), ldc:int(0))) {
                                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-752278115))
                                goto(Label_5777)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1959389906))
                                goto(Label_5515)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1)), ldc:int(0))) {
                                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1461274556))
                                goto(Label_5002)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(128)), ldc:int(0))) {
                                goto(Label_4787)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(128)), ldc:int(0))) {
                                var_1_26CD = and:int(var_1_26CD:int, ldc:int(2000151431))
                                looporswitchbreak()
                            }
                            
                            goto(Label_4515)
                        }
                    }
                    catch (java.lang.Exception var_6_2653) {
                        do {
                            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(8192)), ldc:int(0))) {
                                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-140480053))
                            }
                            else {
                                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1011359067))
                                var_4_1C2 = invokevirtual:HandshakeStatus(SSLEngine::getHandshakeStatus, getfield:SSLEngine(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3d4b\u392e\ud12e\u71ae\u8709\u6198, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))
                            }
                        } while (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0)))
                        
                        var_1_26CD = and:int(var_1_26CD:int, ldc:int(392655306))
                    }
                    
                    loopcontinue()
                
                default:
                    athrow(initobject:IllegalStateException(IllegalStateException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u8aa5\u34df\ub32d\ud36e\u8d98\u8350), and:int(ldc:int(5185), ldc:int(9)))), invokevirtual:Status(SSLEngineResult::getStatus, var_7_11A1:SSLEngineResult)))))
            }
            
            Label_7624:
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_7743)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(128)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(201982909))
            }
            else {
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_5372)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_5312)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_5235)
                }
                
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1233788028))
                invokevirtual:void(SSLEngine::closeOutbound, getfield:SSLEngine(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3d4b\u392e\ud12e\u71ae\u8709\u6198, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))
            }
            
            Label_7684:
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_7624)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_5372)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_5312)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(575291591))
                    goto(Label_5235)
                }
                
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1154521651))
                var_4_1C2 = invokevirtual:HandshakeStatus(SSLEngine::getHandshakeStatus, getfield:SSLEngine(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3d4b\u392e\ud12e\u71ae\u8709\u6198, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))
            }
            
            Label_7743:
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1005796704))
                goto(Label_7684)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-429172923))
                goto(Label_7624)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_5372)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(8192)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1836257443))
                goto(Label_5312)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1889573535))
                goto(Label_5235)
            }
            
            var_1_26CD = and:int(var_1_26CD:int, ldc:int(984050894))
            loopcontinue()
            Label_7884:
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(388973615))
                goto(Label_9594)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_9355)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(942155778))
                goto(Label_9118)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_8899)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_8633)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_8356)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(256)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(757052371))
            }
            else {
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_7406)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(128)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(1624706709))
                    goto(Label_7230)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(398861816))
                    goto(Label_6708)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_6472)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-498516402))
                    goto(Label_6221)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(536870912)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-343998539))
                    goto(Label_6031)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(256)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-2000045609))
                    goto(Label_5777)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_5515)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-694351500))
                    goto(Label_5002)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1452586018))
                    goto(Label_4787)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-900386142))
                    goto(Label_4515)
                }
                
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1467970737))
                
                if (logicalnot:boolean(invokevirtual:boolean(Buffer::hasRemaining, getfield:ByteBuffer[expected:Buffer](\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\ubefe\u4ab3\ubcb0\u34df\u6198\u983f, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18)))) {
                    loopcontinue()
                }
            }
            
            Label_8130:
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1859356505))
                goto(Label_9594)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-906641522))
                goto(Label_9355)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1352496809))
                goto(Label_9118)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1176558100))
                goto(Label_8899)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_8633)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_7884)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_7406)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(757774137))
                    goto(Label_7230)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1095605066))
                    goto(Label_6708)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-380094619))
                    goto(Label_6472)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_6221)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_6031)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(302467037))
                    goto(Label_5777)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_5515)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_5002)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(16384)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1479499010))
                    goto(Label_4787)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-186461471))
                    goto(Label_4515)
                }
                
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-2015024938))
            }
            
            Label_8356:
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_9594)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1083541824))
                goto(Label_9355)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1521875374))
                goto(Label_9118)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-571355944))
                goto(Label_8899)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(536870912)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(2011971428))
            }
            else {
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-368261840))
                    goto(Label_8130)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_7884)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(1026237421))
                    goto(Label_7406)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_7230)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_6708)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_6472)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(536870912)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1444774556))
                    goto(Label_6221)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1392171263))
                    goto(Label_6031)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1274957886))
                    goto(Label_5777)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(32768)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(1946075151))
                    goto(Label_5515)
                }
                
                if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(2130878886))
                    goto(Label_5002)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-678586493))
                    goto(Label_4787)
                }
                
                if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(1024)), ldc:int(0))) {
                    var_1_26CD = and:int(var_1_26CD:int, ldc:int(-412785666))
                    invokevirtual:int(SocketChannel::write, getfield:SocketChannel(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u156b\u7af6\u8d90\u9255\u983f\u69d9, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18), getfield:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\ubefe\u4ab3\ubcb0\u34df\u6198\u983f, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))
                    goto(Label_7884)
                }
                
                goto(Label_4515)
            }
            
            Label_8633:
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(2097152)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(980890130))
                goto(Label_9594)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(536870912)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1370156474))
                goto(Label_9355)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1450454227))
                goto(Label_9118)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_8899)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_8356)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_8130)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_7884)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(1)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1821031590))
                goto(Label_7406)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(131072)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1163550745))
                goto(Label_7230)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(536870912)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1270380586))
                goto(Label_6708)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_6472)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_6221)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(65536)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(-1423815835))
                goto(Label_6031)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_5777)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(128)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1023936315))
                goto(Label_5515)
            }
            
            if (cmpeq:boolean(and:int(var_1_26CD:int, ldc:int(262144)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(1020283237))
                goto(Label_5002)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4096)), ldc:int(0))) {
                var_1_26CD = and:int(var_1_26CD:int, ldc:int(2087300140))
                goto(Label_4787)
            }
            
            if (cmpne:boolean(and:int(var_1_26CD:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_4515)
            }
            
            var_1_26CD = and:int(var_1_26CD:int, ldc:int(2012162796))
        }
    }
    
    private java.nio.ByteBuffer \uc7fe\u9af2\ub8be\u5654\u7ce1\u965f(java.nio.ByteBuffer p0) {
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
            return:ByteBuffer(invokespecial:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\ube23\u3711\ud36e\u9255\uc2bd\u156b, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18, p0:ByteBuffer, invokeinterface:int(SSLSession::getPacketBufferSize, invokevirtual:SSLSession(SSLEngine::getSession, getfield:SSLEngine(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3d4b\u392e\ud12e\u71ae\u8709\u6198, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18)))))
        }
        
        goto(Label_0006)
    }
    
    private java.nio.ByteBuffer \ua6bd\ud7e8\u839e\u4975\uf995\u12b2(java.nio.ByteBuffer p0) {
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
            return:ByteBuffer(invokespecial:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\ube23\u3711\ud36e\u9255\uc2bd\u156b, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18, p0:ByteBuffer, invokeinterface:int(SSLSession::getApplicationBufferSize, invokevirtual:SSLSession(SSLEngine::getSession, getfield:SSLEngine(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3d4b\u392e\ud12e\u71ae\u8709\u6198, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18)))))
        }
        
        goto(Label_0006)
    }
    
    private java.nio.ByteBuffer \ube23\u3711\ud36e\u9255\uc2bd\u156b(java.nio.ByteBuffer p0, int p1) {
        var_3_61 : int
        
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
            var_3_61 = and:int(ldc:int(-1843531658), ldc:int(856126526))
            
            if (cmple:boolean(p1:int, invokevirtual:int(Buffer::capacity, p0:ByteBuffer[expected:Buffer]))) {
                var_3_61 = and:int(var_3_61:int, ldc:int(-741999873))
                p0 = invokestatic:ByteBuffer(ByteBuffer::allocate, mul:int(invokevirtual:int(Buffer::capacity, p0:ByteBuffer[expected:Buffer]), and:int(ldc:int(1542), ldc:int(24995))))
            }
            else {
                p0 = invokestatic:ByteBuffer(ByteBuffer::allocate, p1:int)
            }
            
            return:ByteBuffer(p0:ByteBuffer)
        }
        
        goto(Label_0006)
    }
    
    private java.nio.ByteBuffer \ud7e8\u59ec\u8640\u6198\ube23\u7330(java.nio.ByteBuffer p0) {
        var_4_80 : ByteBuffer
        
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
        
        if (cmpge:boolean(invokeinterface:int(SSLSession::getPacketBufferSize, invokevirtual:SSLSession(SSLEngine::getSession, getfield:SSLEngine(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3d4b\u392e\ud12e\u71ae\u8709\u6198, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))), invokevirtual:int(Buffer::limit, p0:ByteBuffer[expected:Buffer]))) {
            var_4_80 = invokespecial:ByteBuffer(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\uc7fe\u9af2\ub8be\u5654\u7ce1\u965f, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18, p0:ByteBuffer)
            invokevirtual:Buffer(Buffer::flip, p0:ByteBuffer[expected:Buffer])
            invokevirtual:ByteBuffer(ByteBuffer::put, var_4_80:ByteBuffer, p0:ByteBuffer)
            return:ByteBuffer(var_4_80:ByteBuffer)
        }
        
        return:ByteBuffer(p0:ByteBuffer)
    }
    
    private void \ufcaf\u8cae\u8640\uc84e\u8aa5\ucb79() {
        var_1_61 : int
        
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
            var_1_61 = and:int(ldc:int(2062611263), ldc:int(-153354305))
            
            loop {
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_0231)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(16777216)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(-1580078100))
                    goto(Label_0185)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(1959836637))
                    invokevirtual:void(SSLEngine::closeOutbound, getfield:SSLEngine(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3d4b\u392e\ud12e\u71ae\u8709\u6198, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))
                }
                
                try {
                    Label_0142:
                    
                    while (cmpne:boolean(and:int(var_1_61:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(1024)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(32768)), ldc:int(0))) {
                                goto(Block_12)
                            }
                            
                            var_1_61 = and:int(var_1_61:int, ldc:int(2012537342))
                            invokespecial:boolean(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u2dcc\ua562\ubb2b\u3c25\u9033\u5bc4, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18)
                        }
                        
                        Label_0185:
                        
                        if (cmpne:boolean(and:int(var_1_61:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Block_13)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_61:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Block_14)
                        }
                    }
                    
                    goto(Label_0231)
                    Block_12:
                    var_1_61 = and:int(var_1_61:int, ldc:int(48682425))
                    loopcontinue()
                    Block_13:
                    var_1_61 = and:int(var_1_61:int, ldc:int(-927160602))
                    goto(Label_0231)
                    Block_14:
                    
                    if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(1073741824)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_61 = and:int(var_1_61:int, ldc:int(-223301315))
                }
                catch (java.io.IOException stack_E6_0) {
                }
                
                Label_0231:
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_0185)
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0142)
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(16777216)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_1_61 = and:int(var_1_61:int, ldc:int(538682923))
            }
            
            invokevirtual:void(AbstractInterruptibleChannel::close, getfield:SocketChannel[expected:AbstractInterruptibleChannel](\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u156b\u7af6\u8d90\u9255\u983f\u69d9, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \ubefe\u0800\u5245\u960f\u0a06\u3d4b() {
        var_1_B1 : int
        var_3_AB : Exception
        
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
            var_1_B1 = and:int(ldc:int(390023398), ldc:int(1811903166))
            
            loop {
                try {
                    while (cmpeq:boolean(and:int(var_1_B1:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_1_B1:int, ldc:int(536870912)), ldc:int(0))) {
                            var_1_B1 = and:int(var_1_B1:int, ldc:int(-984054476))
                        }
                        else {
                            var_1_B1 = and:int(var_1_B1:int, ldc:int(167729398))
                            invokevirtual:void(SSLEngine::closeInbound, getfield:SSLEngine(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3d4b\u392e\ud12e\u71ae\u8709\u6198, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))
                        }
                        
                        Label_0134:
                        
                        if (cmpeq:boolean(and:int(var_1_B1:int, ldc:int(4)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_B1:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0158)
                        }
                        
                        var_1_B1 = and:int(var_1_B1:int, ldc:int(1152215980))
                    }
                    
                    goto(Label_0182)
                    Label_0158:
                    var_1_B1 = and:int(var_1_B1:int, ldc:int(-206578690))
                }
                catch (java.lang.Exception var_3_AB) {
                    var_1_B1 = and:int(var_1_B1:int, ldc:int(960388351))
                    invokevirtual:void(Throwable::printStackTrace, var_3_AB:Exception[expected:Throwable])
                }
                
                Label_0182:
                
                if (cmpne:boolean(and:int(var_1_B1:int, ldc:int(256)), ldc:int(0))) {
                    var_1_B1 = and:int(var_1_B1:int, ldc:int(2005304273))
                    goto(Label_0134)
                }
                
                if (cmpeq:boolean(and:int(var_1_B1:int, ldc:int(536870912)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_1_B1 = and:int(var_1_B1:int, ldc:int(1355720770))
            }
            
            invokespecial:void(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\ufcaf\u8cae\u8640\uc84e\u8aa5\ucb79, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \ub102\ubcb0\u99f7\ubb2b\u4c2b\u6b0d() {
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
            return:boolean(and:int[expected:boolean](ldc:int(3648), ldc:int(-3649)))
        }
        
        goto(Label_0006)
    }
    
    public void \ub18d\u7049\u99f7\u6bb9\uf94d\ub32d() {
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
    
    public boolean \uc229\u3bd6\u97b7\ud171\ucb79\uf9c5() {
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
            return:boolean(ternaryop:int[expected:boolean](logicalor:boolean(invokevirtual:boolean(Buffer::hasRemaining, getfield:ByteBuffer[expected:Buffer](\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\uc2bd\u0c95\u64ab\u5bc4\u72f1\u624e, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18)), invokevirtual:boolean(Buffer::hasRemaining, getfield:ByteBuffer[expected:Buffer](\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u3dd3\u071d\u62da\ub113\ubf56\u69d9, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18))), and:int(ldc:int(8259), ldc:int(569)), and:int(ldc:int(-31978), ldc:int(29865))))
        }
        
        goto(Label_0006)
    }
    
    public int \u5140\ubf56\u3bd6\u8bb0\ud4fe\u64ab(java.nio.ByteBuffer p0) {
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
            return:int(invokevirtual:int(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::read, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18, p0:ByteBuffer))
        }
        
        goto(Label_0006)
    }
    
    public boolean \ucb79\u62da\u7049\u385b\u67d0\ud12e() {
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
            return:boolean(invokevirtual:boolean(AbstractSelectableChannel::isBlocking, getfield:SocketChannel[expected:AbstractSelectableChannel](\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u156b\u7af6\u8d90\u9255\u983f\u69d9, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18)))
        }
        
        goto(Label_0006)
    }
    
    public boolean isOpen() {
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
            return:boolean(invokevirtual:boolean(AbstractInterruptibleChannel::isOpen, getfield:SocketChannel[expected:AbstractInterruptibleChannel](\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u156b\u7af6\u8d90\u9255\u983f\u69d9, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18)))
        }
        
        goto(Label_0006)
    }
    
    public void close() {
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
            invokespecial:void(\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\ufcaf\u8cae\u8640\uc84e\u8aa5\ucb79, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1D8 : int
        expr_6E : int [generated]
        stack_9B_0 : byte[] [generated]
        stack_9D_0 : byte[] [generated]
        stack_D3_0 : byte[] [generated]
        stack_D5_0 : byte[] [generated]
        stack_109_0 : byte[] [generated]
        stack_10B_0 : byte[] [generated]
        stack_148_0 : byte[] [generated]
        stack_1EB_0 : byte[] [generated]
        stack_23F_0 : byte[] [generated]
        stack_2A6_0 : byte[] [generated]
        stack_32B_0 : byte[] [generated]
        var_4_1C4 : int
        var_3_1C9 : byte[]
        var_5_1CA : int
        expr_1EE : byte [generated]
        var_0_2BF : int
        expr_2A6 : byte [generated]
        stack_2F6_2 : byte [generated]
        stack_2CB_0 : byte [generated]
        var_2_9B : byte[]
        expr_9F : int [generated]
        var_3_22D : byte[]
        var_5_22E : int
        expr_D5 : int [generated]
        expr_10B : int [generated]
        var_3_319 : byte[]
        var_5_31A : int
        var_3_154 : String
        stack_1BD_0 : String[] [generated]
        expr_166 : String[] [generated]
        
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
        var_0_1D8 = and:int(ldc:int(-1838342438), ldc:int(-14290968))
        expr_6E = arraylength:int(stack_9B_0 = stack_9D_0 = stack_D3_0 = stack_D5_0 = stack_109_0 = stack_10B_0 = stack_148_0 = stack_1EB_0 = stack_23F_0 = stack_2A6_0 = stack_32B_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("81pMocq5KWZQobdMr63YXDNYm69gUs5INZdIQMZoQJMXbk4m5INIgymh3rNGTDNStbferzvkrTdCq0Rk0LsdRkLKWDWlxFg7pU7CesvjVFi3UtJg0Ugs9RFqRpNKMOTVN71OQrm7QELGSBm1RuBEL7HWbDfEpx1EVgAERA==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_1C4 = expr_6E:int
        var_3_1C9 = newarray:byte[](byte.class, expr_6E:int)
        var_5_1CA = expr_6E:int
        Label_0460:
        
        while (cmpeq:boolean(and:int(var_0_1D8:int, ldc:int(4)), ldc:int(0))) {
            var_0_1D8 = and:int(var_0_1D8:int, ldc:int(-1082787133))
            var_5_1CA = add:int(var_5_1CA:int, ldc:int(-1))
            expr_1EE = xor:byte(loadelement:byte(stack_1EB_0:byte[], var_5_1CA:int), ldc:byte(66))
            storeelement:byte(var_3_1C9:byte[], var_5_1CA:int, or:int(and:int(shl:int(expr_1EE:byte, xor:int(ldc:int(0), ldc:int(4))), ldc:int(-16)), and:int(shr:int(expr_1EE:byte[expected:int], and:int(ldc:int(6660), ldc:int(52))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_1CA:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9D_0 = stack_9B_0 = stack_D3_0 = stack_D5_0 = stack_109_0 = stack_10B_0 = stack_148_0 = stack_1EB_0 = stack_23F_0 = stack_2A6_0 = stack_32B_0 = var_3_1C9:byte[]
            goto(Label_0115)
        }
        
        var_0_1D8 = and:int(var_0_1D8:int, ldc:int(-1318090339))
        Label_0646:
        
        while (cmpne:boolean(and:int(var_0_1D8:int, ldc:int(128)), ldc:int(0))) {
            var_0_2BF = and:int(var_0_1D8:int, ldc:int(-1012436022))
            var_5_1CA = add:int(var_5_1CA:int, ldc:int(-1))
            expr_2A6 = stack_2F6_2 = loadelement(stack_2A6_0, var_5_1CA)
            
            if (cmplt:boolean(add:int(add:int(var_5_1CA:int, ldc:int(2)), neg:int(var_4_1C4:int)), ldc:int(0))) {
                stack_2F6_2 = stack_2CB_0 = add:byte(expr_2A6:byte, loadelement:byte(var_3_1C9:byte[], add:int(var_5_1CA:int, ldc:int(2))))
                goto(Label_0731)
            }
            
            Label_0691:
            
            if (cmpeq:boolean(and:int(var_0_2BF:int, ldc:int(33554432)), ldc:int(0))) {
                var_0_2BF = and:int(var_0_2BF:int, ldc:int(1267811217))
            }
            else {
                var_0_2BF = and:int(var_0_2BF:int, ldc:int(-1490191662))
                stack_2F6_2 = stack_2CB_0 = add:byte(expr_2A6:byte, ldc:byte(2))
            }
            
            Label_0731:
            
            if (cmpeq:boolean(and:int(var_0_2BF:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_2BF = and:int(var_0_2BF:int, ldc:int(-539581004))
                goto(Label_0691)
            }
            
            var_0_1D8 = and:int(var_0_2BF:int, ldc:int(-360763452))
            storeelement:byte(var_3_1C9:byte[], var_5_1CA:int, stack_2F6_2:byte)
            
            if (cmpne:boolean(var_5_1CA:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9D_0 = stack_9B_0 = stack_D3_0 = stack_D5_0 = stack_109_0 = stack_10B_0 = stack_148_0 = stack_1EB_0 = stack_23F_0 = stack_2A6_0 = stack_32B_0 = var_3_1C9:byte[]
            goto(Label_0218)
        }
        
        var_0_1D8 = and:int(var_0_1D8:int, ldc:int(1912683535))
        goto(Label_0460)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_1D8:int, ldc:int(128)), ldc:int(0))) {
            goto(Label_0272)
        }
        
        if (cmpne:boolean(and:int(var_0_1D8:int, ldc:int(8388608)), ldc:int(0))) {
            goto(Label_0218)
        }
        
        if (cmpne:boolean(and:int(var_0_1D8:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_1D8 = and:int(var_0_1D8:int, ldc:int(375542485))
        }
        else {
            var_0_1D8 = and:int(var_0_1D8:int, ldc:int(-142637086))
            var_2_9B = stack_9B_0:byte[]
            expr_9F = add:int(arraylength:int(stack_9D_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_9F:int, ldc:int(0))) {
                var_3_22D = newarray:byte[](byte.class, expr_9F:int)
                var_5_22E = expr_9F:int
                
                loop {
                    var_0_1D8 = and:int(var_0_1D8:int, ldc:int(-1213909267))
                    var_5_22E = add:int(var_5_22E:int, ldc:int(-1))
                    storeelement:byte(var_3_22D:byte[], var_5_22E:int, add:int(shl:int(loadelement:byte(stack_23F_0:byte[], var_5_22E:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_9B:byte[], add:int(var_5_22E:int, xor:int(ldc:int(16913), ldc:int(16912)))), ldc:int(5)), and:int(ldc:int(15), ldc:int(18951)))))
                    
                    if (cmpne:boolean(var_5_22E:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9D_0 = stack_9B_0 = stack_D3_0 = stack_D5_0 = stack_109_0 = stack_10B_0 = stack_148_0 = stack_1EB_0 = stack_23F_0 = stack_2A6_0 = stack_32B_0 = var_3_22D:byte[]
            }
        }
        
        Label_0164:
        
        if (cmpeq:boolean(and:int(var_0_1D8:int, ldc:int(33554432)), ldc:int(0))) {
            goto(Label_0272)
        }
        
        if (cmpne:boolean(and:int(var_0_1D8:int, ldc:int(16384)), ldc:int(0))) {
            var_0_1D8 = and:int(var_0_1D8:int, ldc:int(1431979718))
        }
        else {
            if (cmpne:boolean(and:int(var_0_1D8:int, ldc:int(8388608)), ldc:int(0))) {
                var_0_1D8 = and:int(var_0_1D8:int, ldc:int(1111178932))
                goto(Label_0115)
            }
            
            var_0_1D8 = and:int(var_0_1D8:int, ldc:int(-1100629304))
            expr_D5 = arraylength:int(stack_D5_0:byte[])
            
            if (cmpne:boolean(expr_D5:int, ldc:int(0))) {
                var_4_1C4 = expr_D5:int
                var_3_1C9 = newarray:byte[](byte.class, expr_D5:int)
                var_5_1CA = expr_D5:int
                goto(Label_0646)
            }
        }
        
        Label_0218:
        
        if (cmpne:boolean(and:int(var_0_1D8:int, ldc:int(64)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1D8:int, ldc:int(4)), ldc:int(0))) {
                var_0_1D8 = and:int(var_0_1D8:int, ldc:int(-1678756287))
                goto(Label_0164)
            }
            
            if (cmpne:boolean(and:int(var_0_1D8:int, ldc:int(8388608)), ldc:int(0))) {
                var_0_1D8 = and:int(var_0_1D8:int, ldc:int(867500603))
                goto(Label_0115)
            }
            
            var_0_1D8 = and:int(var_0_1D8:int, ldc:int(-806002999))
            expr_10B = arraylength:int(stack_10B_0:byte[])
            
            if (cmpne:boolean(expr_10B:int, ldc:int(0))) {
                var_3_319 = newarray:byte[](byte.class, expr_10B:int)
                var_5_31A = expr_10B:int
                
                loop {
                    var_0_1D8 = and:int(var_0_1D8:int, ldc:int(-76041484))
                    var_5_31A = add:int(var_5_31A:int, ldc:int(-1))
                    storeelement:byte(var_3_319:byte[], var_5_31A:int, add:byte(loadelement:byte(stack_32B_0:byte[], var_5_31A:int), ldc:byte(71)))
                    
                    if (cmpne:boolean(var_5_31A:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9D_0 = stack_9B_0 = stack_D3_0 = stack_D5_0 = stack_109_0 = stack_10B_0 = stack_148_0 = stack_1EB_0 = stack_23F_0 = stack_2A6_0 = stack_32B_0 = var_3_319:byte[]
            }
        }
        
        Label_0272:
        
        if (cmpne:boolean(and:int(var_0_1D8:int, ldc:int(1)), ldc:int(0))) {
            var_0_1D8 = and:int(var_0_1D8:int, ldc:int(-1174484501))
            goto(Label_0218)
        }
        
        if (cmpeq:boolean(and:int(var_0_1D8:int, ldc:int(64)), ldc:int(0))) {
            var_0_1D8 = and:int(var_0_1D8:int, ldc:int(928717912))
            goto(Label_0164)
        }
        
        if (cmpne:boolean(and:int(var_0_1D8:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_1D8 = and:int(var_0_1D8:int, ldc:int(-1420967906))
            goto(Label_0115)
        }
        
        var_3_154 = initobject:String(String::<init>, stack_148_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_1BD_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(2051), ldc:int(16659)))
        expr_166 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(8451), ldc:int(5771)))
        storeelement:String(expr_166:String[], and:int(ldc:int(8487), ldc:int(1170)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(-22828), ldc:int(20777)), xor:int(ldc:int(-16289), ldc:int(-16366))))
        storeelement:String(expr_166:String[], xor:int(ldc:int(6), ldc:int(7)), invokevirtual:String[expected:String](String::substring, var_3_154:String, xor:int(ldc:int(-27335), ldc:int(-27276)), xor:int(ldc:int(8215), ldc:int(8310))))
        storeelement:String(expr_166:String[], and:int(ldc:int(-12566), ldc:int(12565)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(16485), ldc:int(4849)), xor:int(ldc:int(16448), ldc:int(16443))))
        putstatic:String[](\u12cb\ud7e8\u071d\u5f50\ud158\u9a18::\u8aa5\u34df\ub32d\ud36e\u8d98\u8350, expr_166:String[])
    }
    
    public void \ube23\u446c\ud158\uff55\uf995\u183a(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_67B : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_D0 : double
        var_3_E2 : int
        var_11_F3 : int
        var_14_11D : double
        var_16_121 : int
        var_12_119 : double
        var_17_686 : int
        
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
        var_3_67B = and:int(ldc:int(-1525735644), ldc:int(-75146315))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u12cb\ud7e8\u071d\u5f50\ud158\u9a18[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
            var_3_67B = and:int(var_3_67B:int, ldc:int(-708429928))
        }
        else {
            var_3_67B = and:int(var_3_67B:int, ldc:int(-286970065))
            var_5_89 = and:int(ldc:int(28929), ldc:int(-28938))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-27419), ldc:int(25114)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D0 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E2 = and:int(var_3_67B:int, ldc:int(-1544131770))
                    var_9_D0 = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F3 = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F3:int, sub:int(var_6_90:int, xor:int(ldc:int(-30720), ldc:int(-30719)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F3:int, and:int(ldc:int(4273), ldc:int(16645)))), var_7_9F:double))) {
                        inc:int(var_11_F3, ldc:int(1))
                    }
                    
                    var_3_67B = and:int(var_3_E2:int, ldc:int(-397112460))
                    var_14_11D = var_7_9F:double
                    var_16_121 = var_11_F3:int
                }
                else {
                    var_11_F3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), xor:int(ldc:int(-16000), ldc:int(-15999)))
                    var_12_119 = var_14_11D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_121 = var_11_F3:int, var_6_90:int)) {
                        var_9_D0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F3:int)
                        var_16_121 = var_11_F3:int
                        var_14_11D = var_12_119:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1562)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-966335012))
                        goto(Label_1272)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1125)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1666748486))
                        goto(Label_0961)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0833)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(2061960800))
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-759098019))
                        goto(Label_0590)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1369849537))
                    }
                    else {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1429897284))
                        
                        if (cmplt:boolean(var_16_121:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0590)
                            }
                            
                            goto(Label_0833)
                        }
                    }
                    
                    Label_0421:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(77960291))
                        goto(Label_1562)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1017445042))
                        goto(Label_1421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1272)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1184789985))
                        goto(Label_1125)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0961)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1561880065))
                        goto(Label_0833)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1412079134))
                        goto(Label_0700)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-451077338))
                            var_11_F3 = and:int(ldc:int(8978), ldc:int(-8979))
                            goto(Label_1551)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0590:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(115070515))
                        goto(Label_1562)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1272)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1125)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0961)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1603206274))
                        goto(Label_0833)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1243049139))
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1286754546))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11D = var_9_D0:double
                            goto(Label_0833)
                        }
                    }
                    
                    Label_0700:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1562)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1931036282))
                        goto(Label_1272)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1125)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1853409634))
                        goto(Label_0961)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1360633761))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-629897764))
                            goto(Label_0590)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-2071774979))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-468927506))
                        var_14_11D = mul:double(ldc:double(0.5), add:double(var_9_D0:double, var_14_11D:double))
                    }
                    
                    Label_0833:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1562)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1373990011))
                        goto(Label_1272)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-74504192))
                        goto(Label_1125)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(261796680))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1834520285))
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1918208080))
                            goto(Label_0590)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-255000610))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_F3 = and:int(ldc:int(25257), ldc:int(65))
                                goto(Label_1125)
                            }
                        }
                    }
                    
                    Label_0961:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1367088224))
                        goto(Label_1562)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-515182738))
                        goto(Label_1421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1450207008))
                        goto(Label_1272)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-348983860))
                            goto(Label_0833)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0590)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1873796951))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1245807667))
                        var_11_F3 = and:int(ldc:int(215), ldc:int(-6360))
                    }
                    
                    Label_1125:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1657894534))
                        goto(Label_1562)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1009985962))
                        goto(Label_1421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(877405476))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0961)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-323442374))
                            goto(Label_0833)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(476818471))
                            goto(Label_0700)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1390002440))
                            goto(Label_0590)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-2010513165))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-19973124))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                                goto(Label_1421)
                            }
                        }
                    }
                    
                    Label_1272:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-982774380))
                        goto(Label_1562)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1125)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-91044759))
                            goto(Label_0961)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-548900820))
                            goto(Label_0833)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1243211545))
                            goto(Label_0700)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0590)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1730880214))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1010774247))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1499477155))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11D:double, var_5_89:int, var_16_121:int)
                        goto(Label_1551)
                    }
                    
                    Label_1421:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(342187166))
                        goto(Label_1562)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1272)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(579534035))
                        goto(Label_1125)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1383346713))
                        goto(Label_0961)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0833)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0700)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1217849448))
                        goto(Label_0590)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_67B = and:int(var_3_67B:int, ldc:int(-1545834636))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11D:double, ldc:double(0.0))
                    Label_1551:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_686 = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1562:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-99135371))
                        goto(Label_1272)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1106029632))
                        goto(Label_1125)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0961)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0833)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0700)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1939562279))
                        goto(Label_0590)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1125348513))
                        var_17_686 = add:int(var_16_121:int, xor:int(ldc:int(-30207), ldc:int(-30208)))
                        looporswitchbreak()
                    }
                }
                
                var_3_67B = and:int(var_3_67B:int, ldc:int(-1108062457))
                
                if (cmple:boolean(var_5_89 = var_17_686:int, sub:int(var_6_90:int, and:int(ldc:int(541), ldc:int(12545))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
            var_3_67B = and:int(var_3_67B:int, ldc:int(549479662))
            goto(Label_0108)
        }
    }
}
